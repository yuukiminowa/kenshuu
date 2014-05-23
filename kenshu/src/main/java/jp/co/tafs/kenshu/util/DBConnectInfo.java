package jp.co.tafs.kenshu.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 
 * DBの接続先を管理するクラスです。
 * src/main/resources/doconnection.properitesファイルの内容を読み取り、
 * 各属性にセットします。
 * 
 * @author kawachi
 *
 */
public class DBConnectInfo {

	/**
	 * DBへの接続文字列です。
	 */
	private String url;

	/**
	 * DBの接続ユーザー名です。 
	 */
	private String user;

	/**
	 * DBの接続パスワードです。 
	 */
	private String password;

	/**
	 * JDBCドライバクラスです。
	 */
	private String driver;

	/**
	 * 設定を記述したプロパティファイルのファイル名です。 
	 */
	public static final String PROPERTIES_FILE = "dbconnection.properties";

	/**
	 * 
	 * DBConnectionのデフォルトコンストラクタです。
	 * DBConnectionをnewしてインスタンスを作る際に呼び出されます。
	 * 
	 * @throws FileNotFoundException ファイルが見つからない場合にthrowします。
	 * @throws IOException ファイルの読み込みに失敗した場合にthrowします。
	 */
	public DBConnectInfo() throws FileNotFoundException, IOException {
		super();

		// プロパティファイルを読み取ります。
		Properties props = new Properties();
		InputStream is = this.getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);
		props.load(is);

		// 読み取ったプロパティファイルの内容を、このクラスのプロパティ（属性）にセットします。
		driver = props.getProperty("jdbc.driver");
		url = props.getProperty("jdbc.url");
		user = props.getProperty("jdbc.user");
		password = props.getProperty("jdbc.password");

	}

	/**
	 * @return driver
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * @param driver セットする driver
	 */
	public void setDriver(String driver) {
		this.driver = driver;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url セットする url
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user セットする user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
