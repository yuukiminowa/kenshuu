package jp.co.tafs.lesson;

import java.util.Scanner;


public class GamePlayer {
	
	public static void main(String args[]) throws Exception {
		
		
		String softwareTitle = "�X�[�p�[�}���I64";									// �\�t�g�E�F�A�^�C�g��
		
		GameHardware mGameHardware = new GameHardware();							// �ۑ�5 �C���X�^���X����
		
		System.out.println ("Hardware : " + mGameHardware.getHardware());			// �ۑ�5 �����\��
		System.out.println ("Maker : " + mGameHardware.getMaker());
		System.out.println ("ReleaseDate : " + mGameHardware.getReleaseDate());
		System.out.println ("Place : " + mGameHardware.getPlace());
		
		mGameHardware.powerOn();
		mGameHardware.insertSoftware(softwareTitle);
		
		mGameHardware.powerStateInfo();												// �ۑ�5 �d��ON/OFF�̏�ԏ��̏o��
		mGameHardware.activeSoftwareInfo();											// �ۑ�5 �A�N�e�B�u�ȃ\�t�g�E�F�A���̏o��
		
		mGameHardware.playSoftware();												// �ۑ�5 �Q�[���\�t�g��V�ԁi���s�j
		
		System.out.println ("���z����͂��ĉ������B");								// �ۑ�5 ���z�̏o��
		Scanner scan = new Scanner (System.in);
		String impressions = scan.next();
		System.out.println (impressions);
		
		
		
		GameHardwareX mGameHardwareX = new GameHardwareX();							// �C���X�^���X����
		
		System.out.println ("Hardware : " + mGameHardwareX.getHardware());			// �����\��
		System.out.println ("Maker : " + mGameHardwareX.getMaker());
		System.out.println ("ReleaseDate : " + mGameHardwareX.getReleaseDate());
		System.out.println ("Place : " + mGameHardwareX.getPlace());
		
		
	}
	
}