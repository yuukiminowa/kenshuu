package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jp.co.tafs.kenshu.game.GameSearchConditionBean;
import jp.co.tafs.kenshu.game.GameBean;
import jp.co.tafs.kenshu.*;
import java.util.*;
import javax.servlet.http.*;

public final class gemelist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
/* 下の<jsp:useBean ...>の行は、
     GameSearchConditionBean conditionBean = request.getAttribute("conditionBean");
     ArrayList gameList = (ArrayList)request.getAttribute("gameList");
   と同じです。 */
   
      out.write('\r');
      out.write('\n');
      jp.co.tafs.kenshu.game.GameSearchConditionBean conditionBean = null;
      synchronized (request) {
        conditionBean = (jp.co.tafs.kenshu.game.GameSearchConditionBean) _jspx_page_context.getAttribute("conditionBean", PageContext.REQUEST_SCOPE);
        if (conditionBean == null){
          conditionBean = new jp.co.tafs.kenshu.game.GameSearchConditionBean();
          _jspx_page_context.setAttribute("conditionBean", conditionBean, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      java.util.ArrayList gameList = null;
      synchronized (request) {
        gameList = (java.util.ArrayList) _jspx_page_context.getAttribute("gameList", PageContext.REQUEST_SCOPE);
        if (gameList == null){
          gameList = new java.util.ArrayList();
          _jspx_page_context.setAttribute("gameList", gameList, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      java.util.ArrayList kensuCount = null;
      synchronized (request) {
        kensuCount = (java.util.ArrayList) _jspx_page_context.getAttribute("kensuCount", PageContext.REQUEST_SCOPE);
        if (kensuCount == null){
          kensuCount = new java.util.ArrayList();
          _jspx_page_context.setAttribute("kensuCount", kensuCount, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      java.util.ArrayList gameTitle = null;
      synchronized (request) {
        gameTitle = (java.util.ArrayList) _jspx_page_context.getAttribute("gameTitle", PageContext.REQUEST_SCOPE);
        if (gameTitle == null){
          gameTitle = new java.util.ArrayList();
          _jspx_page_context.setAttribute("gameTitle", gameTitle, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t<title>ゲーム管理システム</title>\r\n");
      out.write("\t\t<style type=text/css>\r\n");
      out.write("\t\t\t#searchForm{\r\n");
      out.write("\t\t\t\tbackground-color:lightblue;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttr th {\r\n");
      out.write("\t\t\t\tbackground-color:gray;\r\n");
      out.write("\t\t\t\tcolor:white;\r\n");
      out.write("\t\t\t\tfont-weight:bold;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttr td {\r\n");
      out.write("\t\t\t\tbackground-color:white;\r\n");
      out.write("\t\t\t\tcolor:green;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\ttable,th,td {\r\n");
      out.write("\t\t\t\tborder:solid thin;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t.float-left {\r\n");
      out.write("\t\t\t\tfloat:left;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t<script> //検索を押した時の処理（課題１の３）\r\n");
      out.write("\t\t function kakunin(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t if(window.confirm(\"本当に実行していいんですか？後悔しないでくださいよ？\")){\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t\t\t return true;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else{\r\n");
      out.write("\t\t\t\t return false;\r\n");
      out.write("\t\t\t } \r\n");
      out.write("\t\t\t\t \r\n");
      out.write("\t\t }\r\n");
      out.write("\t\tfunction check(){\r\n");
      out.write("\t\t\tif(document.searchForm.gameTitle.value==\"\"){\r\n");
      out.write("\t\t\t\twindow.alert('ゲームタイトルを入力されてないよ');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse if(document.searchForm.hardware.value==\"\"){\r\n");
      out.write("\t\t\t\twindow.alert('ハードウェアを入力されてないよ');\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t }\r\n");
      out.write("\t\tfunction deleteKakunin(){\r\n");
      out.write("\t\t\tif(window.confirm(\"消すの？\")){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t return true;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t else{\r\n");
      out.write("\t\t\t\t return false;\r\n");
      out.write("\t\t\t } \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h1>ゲーム管理システム</h1>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
/*
		 <form>の中に、<input>や<select>等、データを入力するためのコントロールを置きます。
		 formをsubmitすると、 これらのコントロールに入力した値が、サーバーにパラメータとして送信されます。
		 送信の方法(method)には、postとgetがあります。（他にもありますが、よく使うのはこの2種類）
		 postでformを送信すると、ServletのdoPost(request,response)が呼ばれ、getでformを送信すると、doGet(request,response)が呼ばれます。
		 postは、送信したパラメータの内容は見えません。getは、URLの後ろにパラメータが見える形でくっついて表示されます。
		 ブラウザのURL表示欄で、?があれば、その?以降がパラメータです。
		たとえば、
		<form method="get" action="mypage">
		<input type="text" name="hoge1" value="fuga1">
		<input type="text" name="hoge2" value="fuga2">
		<input type="hidden" name="hoge3" value="fuga3">
		</form>
		というフォームをsubmitすると、サブミット先は、
		 http://tafs.co.jp/app/mypage?hoge1=fuga1&hoge2=fuga2&hoge3=fuga3
		 となります。postの場合は?以降は見えません。見えてなくても、送信はされます。
		ブラウザのURL入力欄にURLを入力して、Enterキーを押した場合もgetでの呼び出しです。
		
		*/
      out.write("\t\r\n");
      out.write("\t\t<form id=\"searchForm\" method=\"post\" action=\"\" onSubmit=\"return check()\"name=\"searchForm\">\r\n");
      out.write("\t\t\t<h3>検索条件</h3>\r\n");
      out.write("\t\t\tゲームタイトル:<input type=\"text\" name=\"gameTitle\" value=\"");
      out.print(conditionBean.getGameTitle()  );
      out.write("\">\r\n");
      out.write("\t\t\tハードウェア:<input type=\"text\" name=\"hardware\" value=\"");
      out.print(conditionBean.getHardware()  );
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"検索\" onClick=\"return kakunin();\"> <!-- onClickによりクリックした後の処理を実現  -->\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t<p>");
if(request.getAttribute("message")!=null) request.getAttribute("message");
      out.write("</p>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<p>");
if(request.getAttribute("error")!=null) request.getAttribute("error") ;
      out.write("</p>\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
List<GameBean> dummyCount = new ArrayList<GameBean>();
			for (int i=0;i<kensuCount.size();i++){
      out.write("\r\n");
      out.write("\t\t\t");
	dummyCount.add((GameBean)kensuCount.get(i));
      out.write("\r\n");
      out.write("\t\t\t<p>");
      out.print("検索件数："+ dummyCount.get(i).getKensu()+"件" );
      out.write("</p>\r\n");
      out.write("\t\t\t");
}
      out.write(" \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
System.out.println("aaa"+gameTitle.size()); 
      out.write("\t\r\n");
      out.write("\t\t");
 List<GameBean> dummy2 = new ArrayList<GameBean>();
		for (int i=0;i<gameTitle.size();i++){
		dummy2.add((GameBean)gameTitle.get(i));
		System.out.println(dummy2.get(i).getGameTitle());
		
      out.write("\r\n");
      out.write("\t\t<p>");
      out.print(dummy2.get(i).getGameTitle()+"を削除しました" );
      out.write(" </p>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t<table class=\"float-left\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<caption>ゲームマスタ一覧</caption>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>No</th><th>ゲームタイトル</th><th>ハードウェア</th><th>感想</th><th>キャラクター数</th><th></th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
List<GameBean> dummy = new ArrayList<GameBean>();
		
			for(int i = 0 ; i < gameList.size();i++){ 
      out.write(" \r\n");
      out.write("\t\t\t");
/*
			  * ここでgameListから、Servletで入れたGameBeanをどうやって値をとってくるかが、課題1の山場です。
			  * gameListの型は、Listです。
			  * http://docs.oracle.com/javase/jp/6/api/java/util/List.html
			  * http://docs.oracle.com/javase/jp/6/api/java/util/ArrayList.html
			  * この辺を見て、なんとかGameBeanを取り出してみてください。
			  *
			  */
			 	dummy.add((GameBean)gameList.get(i));
			
				
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(dummy.get(i).getGameId() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(dummy.get(i).getGameTitle() );
      out.write("</td> \r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(dummy.get(i).getHardWare());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(dummy.get(i).getImpression());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(dummy.get(i).getCharaKensu());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td><form id=\"deleteColumn\" method=\"post\" action=\"del\" name=\"deleteColumn\"><input type=\"submit\" value=\"削除\" onClick=\"return deleteKakunin();\"><input type=\"hidden\" name=\"date\" value=");
      out.print( dummy.get(i).getGameId() );
      out.write(">\r\n");
      out.write("\t\t\t\t\t</form></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"float-left\" style=\"width:500px;margin-top:50px;margin-left:50px\">\r\n");
      out.write("\t\t\t課題１\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t<li>htmlとcssを駆使して、画面デザインをかっこよくします。<br>\r\n");
      out.write("\t\t\tかっこいいデザインが思いつかない人は、Webシステム仕様書を参考にしてください。</li>\r\n");
      out.write("\t\t\t<li>始めの画面表示で、「null」という文字が表示されないようにします。</li>\r\n");
      out.write("\t\t\t<li>検索を開始する前に、クライアント側のJavaScriptで処理を続行するかどうかの確認メッセージを表示します。\r\n");
      out.write("\t\t\t<br>キャンセルした場合は検索実行を取りやめます。</li>\r\n");
      out.write("\t\t\t<li>DBの研修課題で作ったゲームマスタの情報を画面下部の一覧に表示します。</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t課題２\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t<li>検索条件に入力した内容で、SQLの検索条件を増やして、検索結果に反映させます。</li>\r\n");
      out.write("\t\t\t<li>検索を開始する前にJavaScriptで入力をチェックします。<br>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>ゲームタイトルに値が入力されていない場合にエラーメッセージ表示</li>\r\n");
      out.write("\t\t\t\t\t<li>ハードウェアに値が入力されていない場合にエラーメッセージ表示</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t課題３\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t<li>ゲームマスタ一覧の検索結果件数を画面に表示します。<br>\r\n");
      out.write("\t\t\tただし、件数は、select count(*) from ...を使ってDBから取得してください。\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t<li>ゲームマスタ一覧に、キャラクタ数を表示する列をを追加してください。</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t\t課題４\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t<li>各ゲームマスタ一覧の最終列に、削除ボタンを追加します。<br>\r\n");
      out.write("\t\t\t\t削除ボタンを押すと、ゲームマスタの該当レコードを削除します。\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>htmlを編集し、削除ボタンを追加</li>\r\n");
      out.write("\t\t\t\t\t<li>GameDeleteServletの追加<li>\r\n");
      out.write("\t\t\t\t\t<li>web.xmlにservletを登録</li>\r\n");
      out.write("\t\t\t\t\t<li>削除ボタンをクリックすると、GameDeleteServletにリクエストを送信する。</li>\r\n");
      out.write("\t\t\t\t\t<li>GameDeleteServletでDBのレコード処理を実装</li>\r\n");
      out.write("\t\t\t\t\t<li>一覧画面を再表示し、メッセージ「{ゲームタイトル}を削除しました。」を表示します。<br>\r\n");
      out.write("\t\t\t\t\t（{ゲームタイトル}は削除したゲームタイトル名）\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t課題５\r\n");
      out.write("\t\t\t<ol>\r\n");
      out.write("\t\t\t<li>各自で自由にアレンジを加えてみましょう。</li>\r\n");
      out.write("\t\t\t<li>Webシステム仕様書を参考に、新規登録・編集画面にも挑戦してみましょう。</li>\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
