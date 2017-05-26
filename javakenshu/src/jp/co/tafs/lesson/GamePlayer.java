package jp.co.tafs.lesson;

import java.util.Scanner;

public class GamePlayer {
	
	public static void main(String args[]) throws Exception {
		
		GameHardware mGameHardware = new GameHardware();
		
		mGameHardware.powerOn();
		mGameHardware.insertSoftware();
		
		mGameHardware.softwareInfo();
		
		mGameHardware.playGame();
		
		System.out.println ("感想を入力して下さい。");
	    Scanner scan = new Scanner (System.in);
	    String impressions = scan.next();
	    System.out.println (impressions);
	}
	
}