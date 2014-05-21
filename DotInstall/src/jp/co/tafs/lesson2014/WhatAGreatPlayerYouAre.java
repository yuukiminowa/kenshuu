package jp.co.tafs.lesson2014;
import java.util.*;
//ゲーム機器のクラス
class GameMachine{
	private String hardware ="PlayStation3"; 	//ハードウェア
	private String maker="Sony";				//メーカー
	private boolean netConnect=false;			//ネット接続の有無
	private String umu;							//ネット接続の有無（日本語変換）
	private Date salesDate = dateInstance(2006,4,1) ;	//発売日
	private int price=60000;					//価格
	private String activeSoftware;				//アクティブなゲーム名 初期値はNULL
	private boolean powerFlag=false;			//電源のON/OFF ONならtrue OFFならfalse
	private boolean softwareFlag=false;			//ゲームソフトの有無 入っているならtrue 入っていないならfalse
	
	
	
	//ゲームで遊んでいるとき呼び出すメソッド
	 void playGamesoft(){
		 if(activeSoftware!=null){
			 System.out.println("今"+activeSoftware+"で遊んでるよ");
		 }
		 else{
			 System.out.println("全然遊んでないよ。たまには遊びなよ");
			 
		 }
	}
	 //setterメソッド ゲーム機情報をセット
	 public void setGameMachine(String hardware,String maker,boolean netConnect,Date salesDate,int price){
		 this.hardware=hardware;
		 this.maker=maker;
		 this.netConnect=netConnect;
		 this.salesDate=salesDate;
		 this.price=price;
	 }
	 //getterメソッド ハードウェア
	 public String getHardware(){
		return hardware;
		 
	 }
	 //getterメソッド メーカー
	 public String getMaker(){
			return maker;
			 
	}
	 //getterメソッド ネット接続の有無
	 public String getNetConnect(){
		 	if(netConnect==false){
		 		 umu="無し";
		 	}
		 	else{
		 		 umu="有り";
		 	}
			return umu;
			 
	}
	 //getterメソッド 発売日
	 public Date getSalesDate(){
			return salesDate;
			 
	}
	 //getterメソッド 価格
	 public int getPrice(){
			return price;
			 
	}
	 //電源を入れるメソッド
	 void onPower(){
		 if(powerFlag==false){
			 powerFlag=true;
		 }
	 }
	 //電源を切るメソッド
	 void offPower(){
		 if(powerFlag==true){
			 powerFlag=false;
		 }
		 
	 }
	 //ゲームソフトを入れる
	 void setSoftware(String gameSoft){
		 if(softwareFlag==false){
			 activeSoftware=gameSoft;
			 softwareFlag=true;
		 }
	 }
	 //ゲームソフトを出す
	 void getSoftware(){
		 if(softwareFlag==true){
			 activeSoftware=null;
			 softwareFlag=false;
		 }
	 }
	 //電源の状態を返す
	 boolean getPowerStatus(){
		return powerFlag;
		 
	 }
	 //アクティブなゲームソフト名を確認する
	 String getActiveSoftware(){
		return activeSoftware;
	 }
	 //新ゲーム機クラスで使っているアクティブなゲームを設定するメソッド
	 public void setActiveSoftware(String gameSoft){
		 activeSoftware=gameSoft;
	 }
	 Date dateInstance(int year,int month , int day){
		 Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, month);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			calendar.set(Calendar.HOUR, 0);
			calendar.set(Calendar.MINUTE, 0);
			calendar.set(Calendar.SECOND, 0);
			calendar.set(Calendar.MILLISECOND, 0);

			return calendar.getTime();
	 }

}
//新ゲーム機クラス
class NewGameMachine extends GameMachine{
	List <String> installGame=new ArrayList<String>(); 
	int cnt=0;
//ゲームソフトを５つまで入れられる
	void setSoftware(String gameSoft){
		if(cnt!=5){
			installGame.add(gameSoft);
			setActiveSoftware(gameSoft);
			cnt++;
		}
		
	}
//最初にインストールしたゲームソフトを消す
	void getSoftware(){
		if(installGame.get(0)!=null){
			installGame.set(0,null);
		}
	}

//指定したゲームソフトを消す
	void getSoftware(String outSoftware){
		for(int i=0;i<installGame.size();i++){
			if(installGame.get(i).equals(outSoftware)){
				installGame.set(i,null);
			}
		}
	}

//インストールしたゲームソフトの一覧表示
	 List<String> gameList(){
		 return this.installGame;
	}
//ゲームを選んでアクティブにする
	void selectGame(String gameSoft){
		for(int i=0;i<installGame.size();i++){
			if(installGame.get(i).equals(gameSoft)){
				setActiveSoftware(gameSoft);
			}
	}
}
//アクティブなゲームソフトの確認
	void Confirmation(){
		getActiveSoftware();
	}
	
	
}
//プレイヤークラス
public class WhatAGreatPlayerYouAre{
	public static void main(String[] args) {
		GameMachine playstation3 = new GameMachine();
		playstation3.setGameMachine("NINTENDO64", "NINTENDO",false, playstation3.dateInstance(1996,6,23),20000);
		
		System.out.println("ゲーム機情報：" +
				"現在のハードは"+playstation3.getHardware()+"\tメーカーは"+playstation3.getMaker()+"\tネット接続は"+playstation3.getNetConnect()+"\t発売日は"+playstation3.getSalesDate()+"\t価格は"+playstation3.getPrice()+"だよ");
		
		if(playstation3.getPowerStatus()==false){
			playstation3.onPower();
		}
		if(playstation3.getActiveSoftware()==null){
			playstation3.setSoftware("FF");
		}
		playstation3.playGamesoft();
		
		System.out.println("感想？最高ー！！");
		
		
		
		NewGameMachine playstation4=new NewGameMachine();
		playstation4.setGameMachine("PlayStation4", "Sony", true, playstation4.dateInstance(2014,2,22),40000);
		System.out.println("ゲーム機情報：" +
				"現在のハードは"+playstation4.getHardware()+"\tメーカーは"+playstation4.getMaker()+"\tネット接続は"+playstation4.getNetConnect()+"\t発売日は"+playstation4.getSalesDate()+"\t価格は"+playstation4.getPrice()+"だよ");
		if(playstation4.getPowerStatus()==false){
			playstation4.onPower();
		}
		playstation4.setSoftware("FF12");
		playstation4.setSoftware("FF13");
		playstation4.setSoftware("FF14");
		playstation4.setSoftware("ウィニングイレブン");
		playstation4.setSoftware("メタルギア");
		List <String> game =playstation4.gameList();
		 System.out.println("------ゲーム一覧-------");
		 for (int i=0;i<game.size();i++){
			 System.out.println(i+1+":"+game.get(i));
		 }
		 System.out.println("-------ここまで--------");

		playstation4.selectGame(playstation4.installGame.get(1));
		playstation4.playGamesoft();
		
		System.out.println("感想？微妙↓↓");
	}
	
}





