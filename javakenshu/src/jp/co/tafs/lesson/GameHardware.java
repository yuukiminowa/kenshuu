package jp.co.tafs.lesson;

public class GameHardware {
	private String hardware = "NINTENDO64";
	private String maker = "任天堂";
	private String networkConnection = "無";
	private String releaseDate = "1996/6/23";
	private int place = 25000;
	
	private boolean powerState = false;
	
	private String activeSoftware = null;
	
	private String softwareTitle = "スーパーマリオ64";
	
	public void softwareInfo() {
		if (powerState == true) {
			System.out.println ("電源状態：ON");
		} else {
			System.out.println ("電源状態：OFF");
		}
		//System.out.println ("アクティブなソフトウェア：", activeSoftware);
		System.out.printf ("アクティブなソフトウェア：", activeSoftware);
		//System.out.println ("電源状態："powerState);
		//System.out.println ("電源状態："powerState);
	}
	
	public boolean checkPowerState() {
		return powerState;
	}
	
	public void powerOn() {
		if (powerState == false) {
			powerState = true;
		}
	}
	
	public void powerOff() {
		if (powerState == true) {
			powerState = false;
		}
	}
	
	public String checkActiveSoftware() {
		if (activeSoftware != null) {
			return activeSoftware;
		} else {
			return null;
		}
	}
	
	public void insertSoftware() {
		if (activeSoftware == null) {
			activeSoftware = softwareTitle;
		}
	}
	
	public void ejectSoftware() {
		if (activeSoftware != null) {
			activeSoftware = null;
		}
	}
	
	public void playGame() throws Exception {
		if (powerState == false) {
			throw new Exception("電源が入っていません。");
		}
		if (activeSoftware != null) {
			throw new Exception("ソフトウェアがありません。");
		}
		System.out.println (activeSoftware);
	}
}