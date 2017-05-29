package jp.co.tafs.lesson;

import java.util.Scanner;


public class GameHardware {
	private String hardware = "NINTENDO64";										// 課題3 ハードウェア属性
	private String maker = "任天堂";
	private String releaseDate = "1996/6/23";
	private int place = 25000;
	
	private boolean powerState = false;											// 課題4 電源ON/OFFの状態
	
	protected String activeSoftware = null;										// 課題4 アクティブなソフトウェアタイトル
	
	
	public String getHardware() {												// 課題6 ハードウェア属性へのAccessor
		return hardware;
	}
	
	public String setHardware(String hardware) {
		return hardware;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public String setMaker(String Maker) {
		return maker;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public String setReleaseData(String ReleaseData) {
		return releaseDate;
	}
	
	public int getPlace() {
		return place;
	}
	
	public int setPlace(int Place) {
		return place;
	}
	
	public boolean checkPowerState() {											// 課題4 電源ON/OFFの状態を確認
		return powerState;
	}
	
	public void powerStateInfo() {												// 課題5 電源ON/OFFの状態情報の出力
		if (powerState == true) {
			System.out.println ("電源状態：ON");
		} else {																// 課題5 入っていなければ電源を入れる
			System.out.println ("電源状態：OFF");
			powerOn();
		}
	}
	
	public void activeSoftwareInfo() {											// 課題5 アクティブなソフトウェア情報の出力
		if (activeSoftware != null) {
			System.out.println ("アクティブなソフトウェア：" + activeSoftware);
		} else {																// 課題5 なければ任意のソフトウェアタイトルを入力
			System.out.println ("アクティブなソフトウェア：" + "なし");
			System.out.println ("感想を入力して下さい。");
		    Scanner scan = new Scanner (System.in);
		    String softwareTitle = scan.next();
		    System.out.println (softwareTitle);
			insertSoftware(softwareTitle);
		}
	}
	
	public void powerOn() {														// 課題4 電源を入れる
		if(powerState != true) {
			powerState = true;
		}
	}
	
	public void powerOff() {													// 課題4 電源を切る
		if(powerState != false) {
			powerState = false;
		}
	}
	
	public String checkActiveSoftware() {										// 課題4 アクティブなソフトウェアを確認
		if (activeSoftware != null) {
			return activeSoftware;
		} else {
			return null;
		}
	}
	
	public void insertSoftware(String softwareTitle) {							// 課題4 ゲームソフトを入れる
			activeSoftware = softwareTitle;
	}
	
	public void ejectSoftware() {												// 課題4 ゲームソフトを出す
			activeSoftware = null;
	}
	
	public void playSoftware() throws Exception {								// 課題4 ゲームソフトを遊ぶ
		if (powerState == false) {												// 課題5 電源やソフトウェアが入っていない場合の例外処理
			throw new Exception("電源が入っていません。");
		}
		if (activeSoftware == null) {
			throw new Exception("ソフトウェアがありません。");
		}
		System.out.println (activeSoftware);
	}
}