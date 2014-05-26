package jp.co.tafs.kenshu.game;

/**
 * 
 * ゲーム情報を表すJavaオブジェクトです。
 * 
 * このクラスのインスタンス1つが、ゲームテーブルの1レコードを表します。
 * 
 * @author kawachi
 *
 */
public class GameBean {

	/**
	 * ゲームID 
	 */
	private int  gameId;

	/**
	 * ゲームタイトル
	 */
	private String gameTitle;

	/**
	 * ハードウェア
	 */
	private String hardWare;

	/**
	 * 感想
	 */
	private String impression;

	/**
	 * カウント
	 */
	private int kensu;
	
	private int charaKensu;
	
	/**
	 * @return gameId
	 */
	public int getGameId() {
		return gameId;
	}

	/**
	 * @param gameId セットする gameId
	 */
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

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
	 * @return hardWare
	 */
	public String getHardWare() {
		return hardWare;
	}

	/**
	 * @param hardWare セットする hardWare
	 */
	public void setHardWare(String hardWare) {
		this.hardWare = hardWare;
	}

	/**
	 * @return impression
	 */
	public String getImpression() {
		return impression;
	}

	/**
	 * @param impression セットする impression
	 */
	public void setImpression(String impression) {
		this.impression = impression;
	}
	
	public void setKensu(int kensu) {
		this.kensu=kensu;
	}
	public int getKensu() {
		return kensu;
	}
	
	public void setCharaKensu(int charaKensu){
		this.charaKensu=charaKensu;
	}
	public int getCharaKensu(){
		return charaKensu;
	}

}
