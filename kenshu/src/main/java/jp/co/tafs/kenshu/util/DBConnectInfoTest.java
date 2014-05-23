package jp.co.tafs.kenshu.util;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * 
 * DBConnectionInfoオブジェクトの動作を確認するためのテストメソッドです。
 * 
 * @author kawachi
 *
 */
public class DBConnectInfoTest {

	@Test
	public void testDBConnectInfo() throws FileNotFoundException, IOException {
		DBConnectInfo info = new DBConnectInfo();
		assertNotNull("URL。", info.getUrl());
		assertNotNull("user。", info.getUser());
		assertNotNull("パスワード", info.getPassword());

	}

}
