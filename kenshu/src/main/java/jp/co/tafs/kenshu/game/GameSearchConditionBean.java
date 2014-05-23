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
	
}
