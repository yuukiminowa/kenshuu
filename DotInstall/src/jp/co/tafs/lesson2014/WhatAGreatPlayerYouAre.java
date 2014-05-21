package jp.co.tafs.lesson2014;
import java.util.*;
//ゲーム機器のクラス
class GameMachine{
	private String hardware ="PlayStation3"; 	//ハードウェア
	private String maker="Sony";				//メーカー
	private String netConnect="有り";			//ネット接続の有無
	private String salesDate="2006/11/11";		//発売日
	private int price=60000;					//価格
	private String activeSoftware;				//アクティブなゲーム名 初期値はNULL
	private boolean powerFlag=false;			//電源のON/OFF ONならtrue OFFならfalse
	private boolean softwareFlag=false;			//ゲームソフトの有無 入っているならtrue 入っていないならfalse
	
	
	//ゲームで遊んでいるとき呼び出すメソッド
	 void playGamesoft(){
		 if(activeSoftware!=null){
			 System.out.println(activeSoftware);
			 System.out.println("playing!!");
		 }
		 else{
			 System.out.println("not playing↓↓");
			 
		 }
	}
	 //setterメソッド ゲーム機情報をセット
	 public void setGameMachine(String hardware,String maker,String netConnect,String salesDate,int price){
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
			return netConnect;
			 
	}
	 //getterメソッド 発売日
	 public String getSalesDate(){
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
	 void gameList(){
		 System.out.println("------ゲーム一覧-------");
		 for (int i=0;i<installGame.size();i++){
			 System.out.println(installGame.get(i));
		 }
		 System.out.println("-------ここまで--------");
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
		playstation3.setGameMachine("NINTENDO64", "NINTENDO", "無し", "1996/06/23",20000);
		
		System.out.println("ゲーム機情報：" +
				"現在のハードは"+playstation3.getHardware()+"\tメーカーは"+playstation3.getMaker()+"\tネット接続は"+playstation3.getNetConnect()+"\t発売日は"+playstation3.getSalesDate()+"\t価格は"+playstation3.getPrice()+"だよ");
		
		if(playstation3.getPowerStatus()==false){
			playstation3.onPower();
		}
		if(playstation3.getActiveSoftware()==null){
			playstation3.setSoftware("FF");
		}
		playstation3.playGamesoft();
		
		System.out.println("最高ー！！");
		
		
		
		NewGameMachine playstation4=new NewGameMachine();
		playstation4.setGameMachine("PlayStation4", "Sony", "有りまくり","2014/2/22",40000);
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
		playstation4.gameList();
		playstation4.selectGame(playstation4.installGame.get(1));
		playstation4.playGamesoft();
		
		System.out.println("微妙↓↓");
	}
	
}





