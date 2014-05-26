package jp.co.tafs.kenshu;

import java.io.*;
import java.sql.Connection;//DBとの接続をするインターフェース
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.tafs.kenshu.game.GameBean;
import jp.co.tafs.kenshu.game.GameSearchConditionBean;
import jp.co.tafs.kenshu.util.DBConnectInfo;

/**
 * 研修で使用する、ゲームソフト管理システムの一覧画面の操作を処理するためのサーブレットクラスです。
 * 
 * サーブレットとは、クライアントから送られた情報を処理するためのサーバー側のJavaプログラムを記述する
 * ためのクラスファイルです。
 * 
 * サーブレットクラスを作るには、クラスをHttpServletを継承することが約束になっています。
 * 
 * サーブレットを、tomcatに代表される、サーブレットコンテナと呼ばれるサーバーソフトウェアに登録することで、
 * サーブレットコンテナが、URLでの要求に応答するために必要なサーブレットクラスを判断して呼び出してくれます。</p>
 * 
 * サーブレットコンテナは、アプリケーションサーバーの1種です。
 * 
 * @author kawachi
 *
 */
public class GameDeleteServlet extends HttpServlet {

	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		GameSearchConditionBean conditionBean = new GameSearchConditionBean();
		request.setAttribute("conditionBean", conditionBean);

		// jspファイルへ処理を転送します。
		// jspとは、javaでhtmlを組み立てるプログラムの仕組みです。
		// サーバー上で、jspのプログラムの記述内容に従って、htmlを組み立てて、
		// クライアントのウェブブラウザに送信します。
		getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/gemelist.jsp")
				.forward(request, response);
	}

	/**
	 * 
	 * 画面からsubmitボタンを押すと呼び出されるメソッドです。
	 * 
	 * @param request 画面からの要求内容を含むオブジェクトです。
	 * @param response 画面への応答内容を含むオブジェクトです。
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {

		// 文字化け対策のお約束です。
		request.setCharacterEncoding("UTF-8");
	

		// 検索条件のオブジェクトを生成して,画面から入力した検索条件の情報をセットします。
		GameSearchConditionBean conditionBean = new GameSearchConditionBean();
		{
			String hardware = request.getParameter("hardware");
			String gameTitle = request.getParameter("gameTitle");
			String a=request.getParameter("date");
			int  b= Integer.parseInt(a);
			if (hardware == null) {
				hardware = "";
			}
			
			if (gameTitle == null) {
				gameTitle = "";
			}
			
			conditionBean.setGameId(b);
			conditionBean.setGameTitle(gameTitle);
			conditionBean.setHardware(hardware);
			
		}

		// 検索条件を画面に再現させるため、クライアントへの応答内容に検索条件のオブジェクトをセットします。
		// jspでクライアントの画面を組み立てる際に、requestオブジェクトから検索条件のオブジェクトを参照します。
		request.setAttribute("conditionBean", conditionBean);

		String error = "";

		// TODO 研修課題 selectGameListで、画面で入力した検索条件に応じたゲームを返す処理を実装してください。
		{
			try {
			String sql = getSqlOfDeleteGameList(conditionBean);
			List<GameBean> gameTitle = selectGameTitle(conditionBean);
			request.setAttribute("gameTitle", gameTitle);
			
			
			
			// DBへ接続するメソッドを呼び出します。
			try (Connection connection = getConnection()) {

				// StatementはSQLを実行するためのオブジェクトです。
				Statement statement = connection.createStatement();//createStatementはCollectionインターフェースのメソッドでSQL文をデータベースに送る（Statementクラスを返す）

				// SQLの実行結果は、ResultSetに入ってきます。
				int cont = statement.executeUpdate(sql) ;										
					System.out.println("削除件数："+cont);
				
					List<GameBean> gameList = selectGameList(conditionBean);
					request.setAttribute("gameList", gameList);
						
			}
				

			} catch (ClassNotFoundException e) {
				error = "OracleのJDBCドライバが見つかりません。" + e.getMessage();
				e.printStackTrace();
			} catch (SQLException e) {
				error = "SQLが間違っているか、DBに接続できません。" + e.getMessage();
				e.printStackTrace();
			}

		}

		// gamelist.jspを表示します。
		getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/gemelist.jsp")
				.forward(request, response);

	}
	
	private List<GameBean> selectGameList(GameSearchConditionBean conditionBean) throws SQLException,
			ClassNotFoundException, FileNotFoundException, IOException {
		String sql;
	
		// 結果のゲームを格納するためのListのインスタンスを新しく生成します。
		// Listとは、配列をより使いやすくしたオブジェクトです。
		List<GameBean> gameList = new ArrayList<GameBean>();
		{
			// SQLを組みたてるメソッドを呼び出します。
			
				sql = getSqlOfSelectGameList(conditionBean);
			
			// DBへ接続するメソッドを呼び出します。
			try (Connection connection = getConnection()) {

				// StatementはSQLを実行するためのオブジェクトです。
				Statement statement = connection.createStatement();//createStatementはCollectionインターフェースのメソッドでSQL文をデータベースに送る（Statementクラスを返す）

				// SQLの実行結果は、ResultSetに入ってきます。
				try (ResultSet result = statement.executeQuery(sql)) {											//executeQuery(String sql) 単一のResultSetオブジェクトを返す、指定されたSQL文を実行する。

					// 検索したレコードの数だけ繰り返します。
					while (result.next()) {
						//TODO 研修課題 ここで、検索結果をJavaのオブジェクトに変換する処理を記述します。
						GameBean gameBean = new GameBean();
						gameBean.setGameId(result.getInt("GAME_ID"));
						gameBean.setGameTitle(result.getString("GAME_TITLE"));
						gameBean.setHardWare(result.getString("HARDWARE"));
						gameBean.setImpression(result.getString("IMPRESSION"));
						gameBean.setCharaKensu(result.getInt("DUMMYCOUNT"));
						
						
						gameList.add(gameBean);
					}

				}
						
			}
		}

		// 上記処理で組み立てたListを返り値として戻します。
		return gameList;
	}
	
	private List<GameBean> selectGameTitle(GameSearchConditionBean conditionBean) throws SQLException,
			ClassNotFoundException, FileNotFoundException, IOException {
		String sql;
	
		// 結果のゲームを格納するためのListのインスタンスを新しく生成します。
		// Listとは、配列をより使いやすくしたオブジェクトです。
		List<GameBean> gameTitle = new ArrayList<GameBean>();
		{
			// SQLを組みたてるメソッドを呼び出します。
			
				sql = getSqlOfDeleteGameTitle(conditionBean);
			
			// DBへ接続するメソッドを呼び出します。
			try (Connection connection = getConnection()) {

				// StatementはSQLを実行するためのオブジェクトです。
				Statement statement = connection.createStatement();//createStatementはCollectionインターフェースのメソッドでSQL文をデータベースに送る（Statementクラスを返す）

				// SQLの実行結果は、ResultSetに入ってきます。
				try (ResultSet result = statement.executeQuery(sql)) {											//executeQuery(String sql) 単一のResultSetオブジェクトを返す、指定されたSQL文を実行する。

					// 検索したレコードの数だけ繰り返します。
					while (result.next()) {
						//TODO 研修課題 ここで、検索結果をJavaのオブジェクトに変換する処理を記述します。
						GameBean gameBean = new GameBean();
						gameBean.setGameTitle(result.getString("GAME_TITLE"));
						System.out.println(result.getString("GAME_TITLE")+"bbbb");
						gameTitle.add(gameBean);
					}

				}
						
			}
		}

		// 上記処理で組み立てたListを返り値として戻します。
		return gameTitle;
	}


	/**
	 * propertiesファイルに定義した接続先情報を読み込みます。
	 * 
	 * @return
	 * @throws ClassNotFoundException JDBCドライバクラスが見つからない場合にthrowします。
	 * @throws SQLException SQLが不正か、DBに接続できない場合にthrowします。
	 * @throws IOException プロパティファイルを読み込めない場合にthrowします。 
	 * @throws FileNotFoundException プロパティファイルが存在しない場合にthrowします。 
	 */
	private Connection getConnection() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {

		// propertiesファイル読み込み
		DBConnectInfo info = new DBConnectInfo();

		Class.forName(info.getDriver());
		Connection connection = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassword());//指定されたデータベースのURLへの接続を試みます。

		return connection;
	}

	/**
	 * 
	 * 検索条件に応じて変わるゲーム検索用SELECTのSQLを文字列で返します。</p>
	 * 
	 * <注意>
	 * ここでは検索条件を直接文字列に組み込んでSQLを作成します。</p>
	 * 
	 * 検索条件部分のように、画面からの入力等で動的に変わる部分は、
	 * SQLの文字列とは別にして、後から設定できるようにするのが
	 * セキュリティやパフォーマンス面で行儀の良いプログラムとされています。
	 * (バインドメカニズムと言います）
	 * この研修はそこまで意識する必要はありません。</p>
	 * 
	 * この文章の意味がわからなくても、今の時点では気にする必要はありません。
	 * 
	 * @param conditionBean 画面で入力した検索条件を格納したBean
	 * @return 検索用SQLを格納した文字列
	 */
	private String getSqlOfDeleteGameList(GameSearchConditionBean conditionBean) {

		//TODO 研修課題 検索条件に応じた検索をするためのSQL文字列を返す処理を記述してください。
		
		StringBuilder sql = new StringBuilder();
		{
			sql.append("/*TODO 研修課題 このSQLを編集して、ゲームリストを取得するSQLに変更してください。*/" + "\n");
			sql.append("DELETE	" + "\n");
			sql.append("  FROM		" + "\n");
			sql.append("  M_GAME		" + "\n");
			sql.append("  WHERE		" + "\n");
			sql.append("  GAME_ID=		"+conditionBean.getGameId()+ "\n");
	
		
			
		}

		System.out.println(sql.toString());

		return sql.toString();

	}
	private String getSqlOfDeleteGameTitle(GameSearchConditionBean conditionBean) {

		//TODO 研修課題 検索条件に応じた検索をするためのSQL文字列を返す処理を記述してください。
		
		StringBuilder sql = new StringBuilder();
		{
			sql.append("/*TODO 研修課題 このSQLを編集して、ゲームリストを取得するSQLに変更してください。*/" + "\n");
			sql.append("SELECT	" + "\n");
			sql.append("  GAME_TITLE		" + "\n");
			sql.append("FROM" + "\n");
			sql.append("  M_GAME		" + "\n");
			sql.append("  WHERE		" + "\n");
			sql.append("  GAME_ID=		"+conditionBean.getGameId()+ "\n");
	
		
			
		}

		System.out.println(sql.toString());

		return sql.toString();

	}
	private String getSqlOfSelectGameList(GameSearchConditionBean conditionBean) {

		//TODO 研修課題 検索条件に応じた検索をするためのSQL文字列を返す処理を記述してください。

		StringBuilder sql = new StringBuilder();
		{
			sql.append("/*TODO 研修課題 このSQLを編集して、ゲームリストを取得するSQLに変更してください。*/" + "\n");
			sql.append("SELECT	" + "\n");
			sql.append("  M.GAME_ID,		" + "\n");
			sql.append("  M.GAME_TITLE,		" + "\n");
			sql.append("  M.HARDWARE,		" + "\n");
			sql.append("  M.IMPRESSION,		" + "\n");
			sql.append("  COUNT(M_GAME_CHARACTER.CHARACTER_ID)AS DUMMYCOUNT		" + "\n");
			sql.append("FROM" + "\n");
			sql.append("M_GAME	M	" + "\n");
			sql.append("LEFT OUTER JOIN	" + "\n");
			sql.append(" M_GAME_CHARACTER 		" + "\n");
			sql.append(" ON		" + "\n");
			sql.append(" M.GAME_ID =M_GAME_CHARACTER.GAME_ID		" + "\n");
			sql.append("  GROUP BY 		" + "\n");
			sql.append("  M.GAME_ID,M.GAME_TITLE,M.HARDWARE,M.IMPRESSION		" + "\n");
			sql.append("  ORDER BY 		" + "\n");
			sql.append("  M.GAME_ID 		" + "\n");
			
		}

		System.out.println(sql.toString());

		return sql.toString();

	}
	
}

