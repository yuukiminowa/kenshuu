package src.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import src.main.java.Question1;

public class Question1Test extends Question1 {

	Question1 question1 = new Question1();
	
	@Test
	public void testMultiply() {
		// 1×1=1であることを確認する。
		assertEquals(1, question1.multiply(1, 1));
		// 7×6=42であることを確認する。
		assertEquals(42, question1.multiply(7, 6));
		// 0×0=0であることを確認する。
		assertEquals(0, question1.multiply(0, 0));
	}
	
	@Test
	public void testMultiply_計算違いで失敗() {
		// 計算結果が24であることを確認したいが、計算する値が誤っている場合。
		assertEquals(24, question1.multiply(4, 8));
	}
	
	@Test
	public void testMultiply_型違いで失敗() {
		// String型で取得したいが、型が違う場合。
		assertEquals("32", question1.multiply(4, 8));
	}
	
	@Test
	public void testMultipulication_二の段計算結果() {
		// 二の段の答えを配列に格納。
		String[] numList = {"2", "4", "6", "8", "10", "12", "14", "16", "18"};
		int timesNum = 2;
		// 計算結果を確認。
		assertEquals(numList[0], question1.multiplication(timesNum)[0]);
		assertEquals(numList[1], question1.multiplication(timesNum)[1]);
		assertEquals(numList[2], question1.multiplication(timesNum)[2]);
		assertEquals(numList[3], question1.multiplication(timesNum)[3]);
		assertEquals(numList[4], question1.multiplication(timesNum)[4]);
		assertEquals(numList[5], question1.multiplication(timesNum)[5]);
		assertEquals(numList[6], question1.multiplication(timesNum)[6]);
		assertEquals(numList[7], question1.multiplication(timesNum)[7]);
		assertEquals(numList[8], question1.multiplication(timesNum)[8]);
	}
	
	@Test
	public void testMultipulication_六の段計算結果() {
		// 六の段の答えを配列に格納。
		String[] numList = {"6", "12", "18", "24", "30", "36", "42", "48", "54"};
		int timesNum = 6;
		// 計算結果を確認。
		assertEquals(numList[0], question1.multiplication(timesNum)[0]);
		assertEquals(numList[1], question1.multiplication(timesNum)[1]);
		assertEquals(numList[2], question1.multiplication(timesNum)[2]);
		assertEquals(numList[3], question1.multiplication(timesNum)[3]);
		assertEquals(numList[4], question1.multiplication(timesNum)[4]);
		assertEquals(numList[5], question1.multiplication(timesNum)[5]);
		assertEquals(numList[6], question1.multiplication(timesNum)[6]);
		assertEquals(numList[7], question1.multiplication(timesNum)[7]);
		assertEquals(numList[8], question1.multiplication(timesNum)[8]);
	}
	
	@Test
	public void testMultipulication_九の段計算結果() {
		// 六の段の答えを配列に格納。
		String[] numList = {"9", "18", "27", "36", "45", "54", "63", "72", "81"};
		int timesNum = 9;
		// 計算結果を確認。
		assertEquals(numList[0], question1.multiplication(timesNum)[0]);
		assertEquals(numList[1], question1.multiplication(timesNum)[1]);
		assertEquals(numList[2], question1.multiplication(timesNum)[2]);
		assertEquals(numList[3], question1.multiplication(timesNum)[3]);
		assertEquals(numList[4], question1.multiplication(timesNum)[4]);
		assertEquals(numList[5], question1.multiplication(timesNum)[5]);
		assertEquals(numList[6], question1.multiplication(timesNum)[6]);
		assertEquals(numList[7], question1.multiplication(timesNum)[7]);
		assertEquals(numList[8], question1.multiplication(timesNum)[8]);
	}
}