package jp.co.tafs.lesson;

import java.util.Scanner;


public class GamePlayer {
	
	public static void main(String args[]) throws Exception {
		
		
		String softwareTitle = "スーパーマリオ64";									// ソフトウェアタイトル
		
		GameHardware mGameHardware = new GameHardware();							// 課題5 インスタンス生成
		
		System.out.println ("Hardware : " + mGameHardware.getHardware());			// 課題5 属性表示
		System.out.println ("Maker : " + mGameHardware.getMaker());
		System.out.println ("ReleaseDate : " + mGameHardware.getReleaseDate());
		System.out.println ("Place : " + mGameHardware.getPlace());
		
		mGameHardware.powerOn();
		mGameHardware.insertSoftware(softwareTitle);
		
		mGameHardware.powerStateInfo();												// 課題5 電源ON/OFFの状態情報の出力
		mGameHardware.activeSoftwareInfo();											// 課題5 アクティブなソフトウェア情報の出力
		
		mGameHardware.playSoftware();												// 課題5 ゲームソフトを遊ぶ（実行）
		
		System.out.println ("感想を入力して下さい。");								// 課題5 感想の出力
		Scanner scan = new Scanner (System.in);
		String impressions = scan.next();
		System.out.println (impressions);
		
		
		
		GameHardwareX mGameHardwareX = new GameHardwareX();							// インスタンス生成
		
		System.out.println ("Hardware : " + mGameHardwareX.getHardware());			// 属性表示
		System.out.println ("Maker : " + mGameHardwareX.getMaker());
		System.out.println ("ReleaseDate : " + mGameHardwareX.getReleaseDate());
		System.out.println ("Place : " + mGameHardwareX.getPlace());
		
		
	}
	
}