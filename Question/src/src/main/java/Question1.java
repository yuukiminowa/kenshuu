package src.main.java;

public class Question1 {
	
	public static void main(String[] args) {
		Question1 q=new Question1();
		q.calc();
		
	}
	
	/**
	 * 掛け算を実行するメソッドです。
	 * 
	 * @param num1 掛ける値1。
	 * @param num2 掛ける値2。
	 * @return 計算結果を返します。
	 */
	public int multiply(int num1, int num2) {
		int r = num1*num2;
		
		return r;
	}
	
	
	/**
	 * 引数に与えられた値の九九の段を計算するメソッドです。
	 * 
	 * @param timesNum 掛ける段の値。
	 * @return 計算結果を配列で返します。
	 */
	public String[] multiplication(int timesNum) {
		String[] calcString = new String[9];
		
		for(int i=0;i<calcString.length;i++){
			Integer oi=new Integer(multiply(timesNum,i+1));
			calcString[i]=oi.toString();
		}
		
		return calcString;
	}
	public void calc(){
		for(int i=1;i<=9;i++){
		String [] a=multiplication(i);
			for(int j=0;j<a.length;j++){
				System.out.print(i+"*"+(j+1)+"="+a[j]+"\t");
			}
			System.out.printf("\n");
			
		}
	}
}