package jp.co.tafs.lesson;

import java.util.ArrayList;


public class GameHardwareX extends GameHardware {
	
	private String hardware = "Nintendo Switch";
	private String maker = "任天堂";
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
	public void insertSoftware(String softwareTitle){					// 課題7 ゲームソフトを入れる(Override)
		if(installSoftwareList.size() <= 5) {
			installSoftwareList.add(softwareTitle);
		}
	}
	
	@Override
	public void ejectSoftware() {										// 課題7 ゲームソフトを出す(Override)
		if(installSoftwareList.get(0) != null) {
			installSoftwareList.set(0, null);
		}
	}
	
	public void ejectSoftware(String softwareTitle) {					// 課題7 ゲームソフトを出す(Overload)
		int size = installSoftwareList.size();
		for(int i=0; i<size; i++) {
			if (installSoftwareList.get(i) != softwareTitle) {
				installSoftwareList.set(i, null);
			}
		}
	}
	
	public ArrayList<String> getSoftwareList() {						// 課題7 追加済みゲームソフト一覧を取得
		return installSoftwareList;
	}
	
	public void selectSoftware(String softwareTitle) {					// 課題7 ゲームソフトを選ぶ
		if(installSoftwareList.indexOf(softwareTitle) != -1) {
			activeSoftware = softwareTitle;
		} else {
			System.out.println("そのようなソフトウェアはありません。");
		}
	}
	
	public String checkActiveSoftware(String softwareTitle) {			// 課題7 アクティブなソフトウェアを確認
		if(activeSoftware != null) {
			return activeSoftware;
		} else {
			return null;
		}
	}
	
}