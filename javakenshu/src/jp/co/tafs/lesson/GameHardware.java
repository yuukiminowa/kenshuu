package jp.co.tafs.lesson;

public class GameHardware {
	private String hardware = "NINTENDO64";
	private String maker = "�C�V��";
	private String networkConnection = "��";
	private String releaseDate = "1996/6/23";
	private int place = 25000;
	
	
	public void playGame() {
		
		System.out.println ("playGame���\�b�h�̒�");
		
	}
	
	public void powerOn() {
		
	}
	
	public void powerOff() {
		
	}
	
	public void insertSoftware() {
		
	}
	
	public void ejectSoftware() {
		
	}
	
	public boolean powerState() {
		return true;
	}
	
	public String activeSoftware() {
		return "xxx";
	}
	
}
