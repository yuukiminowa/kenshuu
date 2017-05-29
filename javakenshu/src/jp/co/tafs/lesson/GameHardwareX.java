package jp.co.tafs.lesson;

import java.util.ArrayList;


public class GameHardwareX extends GameHardware {
	
	private String hardware = "Nintendo Switch";
	private String maker = "�C�V��";
	private String releaseDate = "2017/3/3";
	private int place = 29980;
	
	ArrayList<String> installSoftwareList = new ArrayList<String>();
	
	
	public String getHardware() {
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
	
	@Override
	public void insertSoftware(String softwareTitle){					// �ۑ�7 �Q�[���\�t�g������(Override)
		if(installSoftwareList.size() <= 5) {
			installSoftwareList.add(softwareTitle);
		}
	}
	
	@Override
	public void ejectSoftware() {										// �ۑ�7 �Q�[���\�t�g���o��(Override)
		if(installSoftwareList.get(0) != null) {
			installSoftwareList.set(0, null);
		}
	}
	
	public void ejectSoftware(String softwareTitle) {					// �ۑ�7 �Q�[���\�t�g���o��(Overload)
		int size = installSoftwareList.size();
		for(int i=0; i<size; i++) {
			if (installSoftwareList.get(i) != softwareTitle) {
				installSoftwareList.set(i, null);
			}
		}
	}
	
	public ArrayList<String> getSoftwareList() {						// �ۑ�7 �ǉ��ς݃Q�[���\�t�g�ꗗ���擾
		return installSoftwareList;
	}
	
	public void selectSoftware(String softwareTitle) {					// �ۑ�7 �Q�[���\�t�g��I��
		if(installSoftwareList.indexOf(softwareTitle) != -1) {
			activeSoftware = softwareTitle;
		} else {
			System.out.println("���̂悤�ȃ\�t�g�E�F�A�͂���܂���B");
		}
	}
	
	public String checkActiveSoftware(String softwareTitle) {			// �ۑ�7 �A�N�e�B�u�ȃ\�t�g�E�F�A���m�F
		if(activeSoftware != null) {
			return activeSoftware;
		} else {
			return null;
		}
	}
	
}