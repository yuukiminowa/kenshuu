package jp.co.tafs.lesson;

import java.util.Scanner;

public class GamePlayer {
	
	public static void main(String args[]) throws Exception {
		
		GameHardware mGameHardware = new GameHardware();
		
		mGameHardware.powerOn();
		mGameHardware.insertSoftware();
		
		mGameHardware.softwareInfo();
		
		mGameHardware.playGame();
		
		System.out.println ("���z����͂��ĉ������B");
	    Scanner scan = new Scanner (System.in);
	    String impressions = scan.next();
	    System.out.println (impressions);
	}
	
}