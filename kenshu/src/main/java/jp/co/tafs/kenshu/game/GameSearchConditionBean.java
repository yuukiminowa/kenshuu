package jp.co.tafs.kenshu.game;



/**
 * ゲーム検索条件Bean
 * 
 * @author kawachi
 *
 */
public class GameSearchConditionBean {

	/**
	 * ゲームタイトル
	 */
	private String gameTitle = "";
	
	/**
	 * ハードウェア
	 */
	private String hardware = "";
	
	
	private String deleteGameTitle = "";

	private String deleteHardWare = "";
	
	private int gameId;
	/**
	 * @return gameTitle
	 */
	public String getGameTitle() {
		return gameTitle;
	}

	/**
	 * @param gameTitle セットする gameTitle
	 */
	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	/**
	 * @return hardware
	 */
	public String getHardware() {
		return hardware;
	}

	/**
	 * @param hardware セットする hardware
	 */
	public void setHardware(String hardware) {
		this.hardware = hardware;
	}
	
	public void setDeleteGameTitle(String gameTitle) {
		this.deleteGameTitle = gameTitle;
	}
	
	public String getDeleteGameTitle() {
		return deleteGameTitle;
	}
	
	public String getDeletehardware() {
		return deleteHardWare;
	}
	
	public void setDeletehardware(String hardware) {
		this.deleteHardWare = hardware;
	}

	public void setGameId(int a) {
		// TODO 自動生成されたメソッド・スタブ
		this.gameId=a;
	}
	
	public int getGameId(){
		return gameId;
	}
	
}
