package jp.co.tafs.lesson;

import java.util.Scanner;


public class GameHardware {
	private String hardware = "NINTENDO64";										// �ۑ�3 �n�[�h�E�F�A����
	private String maker = "�C�V��";
	private String releaseDate = "1996/6/23";
	private int place = 25000;
	
	private boolean powerState = false;											// �ۑ�4 �d��ON/OFF�̏��
	
	protected String activeSoftware = null;										// �ۑ�4 �A�N�e�B�u�ȃ\�t�g�E�F�A�^�C�g��
	
	
	public String getHardware() {												// �ۑ�6 �n�[�h�E�F�A�����ւ�Accessor
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
	
	public boolean checkPowerState() {											// �ۑ�4 �d��ON/OFF�̏�Ԃ��m�F
		return powerState;
	}
	
	public void powerStateInfo() {												// �ۑ�5 �d��ON/OFF�̏�ԏ��̏o��
		if (powerState == true) {
			System.out.println ("�d����ԁFON");
		} else {																// �ۑ�5 �����Ă��Ȃ���Γd��������
			System.out.println ("�d����ԁFOFF");
			powerOn();
		}
	}
	
	public void activeSoftwareInfo() {											// �ۑ�5 �A�N�e�B�u�ȃ\�t�g�E�F�A���̏o��
		if (activeSoftware != null) {
			System.out.println ("�A�N�e�B�u�ȃ\�t�g�E�F�A�F" + activeSoftware);
		} else {																// �ۑ�5 �Ȃ���ΔC�ӂ̃\�t�g�E�F�A�^�C�g�������
			System.out.println ("�A�N�e�B�u�ȃ\�t�g�E�F�A�F" + "�Ȃ�");
			System.out.println ("���z����͂��ĉ������B");
		    Scanner scan = new Scanner (System.in);
		    String softwareTitle = scan.next();
		    System.out.println (softwareTitle);
			insertSoftware(softwareTitle);
		}
	}
	
	public void powerOn() {														// �ۑ�4 �d��������
		if(powerState != true) {
			powerState = true;
		}
	}
	
	public void powerOff() {													// �ۑ�4 �d����؂�
		if(powerState != false) {
			powerState = false;
		}
	}
	
	public String checkActiveSoftware() {										// �ۑ�4 �A�N�e�B�u�ȃ\�t�g�E�F�A���m�F
		if (activeSoftware != null) {
			return activeSoftware;
		} else {
			return null;
		}
	}
	
	public void insertSoftware(String softwareTitle) {							// �ۑ�4 �Q�[���\�t�g������
			activeSoftware = softwareTitle;
	}
	
	public void ejectSoftware() {												// �ۑ�4 �Q�[���\�t�g���o��
			activeSoftware = null;
	}
	
	public void playSoftware() throws Exception {								// �ۑ�4 �Q�[���\�t�g��V��
		if (powerState == false) {												// �ۑ�5 �d����\�t�g�E�F�A�������Ă��Ȃ��ꍇ�̗�O����
			throw new Exception("�d���������Ă��܂���B");
		}
		if (activeSoftware == null) {
			throw new Exception("�\�t�g�E�F�A������܂���B");
		}
		System.out.println (activeSoftware);
	}
}