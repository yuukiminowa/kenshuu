package jp.co.tafs.lesson;

public class GameHardware {
	private String hardware = "NINTENDO64";
	private String maker = "�C�V��";
	private String networkConnection = "��";
	private String releaseDate = "1996/6/23";
	private int place = 25000;
	
	private boolean powerState = false;
	
	private String activeSoftware = null;
	
	private String softwareTitle = "�X�[�p�[�}���I64";
	
	public void softwareInfo() {
		if (powerState == true) {
			System.out.println ("�d����ԁFON");
		} else {
			System.out.println ("�d����ԁFOFF");
		}
		//System.out.println ("�A�N�e�B�u�ȃ\�t�g�E�F�A�F", activeSoftware);
		System.out.printf ("�A�N�e�B�u�ȃ\�t�g�E�F�A�F", activeSoftware);
		//System.out.println ("�d����ԁF"powerState);
		//System.out.println ("�d����ԁF"powerState);
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
			throw new Exception("�d���������Ă��܂���B");
		}
		if (activeSoftware != null) {
			throw new Exception("�\�t�g�E�F�A������܂���B");
		}
		System.out.println (activeSoftware);
	}
}