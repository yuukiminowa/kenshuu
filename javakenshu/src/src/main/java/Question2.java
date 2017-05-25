package src.main.java;

public class Question2 {

	/**
	 * mainメソッドです。
	 * ここから処理を実行します。
	 */
	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = {5, 4, 2, 3, 8, 7, 1, 0, 6, 9};
		
		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrintln(arr);
		
		// ソートを実行します。
		quickSort(arr, 0, arr.length-1);
		
		// ソート後の値をコンソールに出力します。
		System.out.print("ソート後：");
		arrayPrintln(arr);
	}
	
	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	public static void quickSort(int[] arr, int left, int right) {
		if(left<=right) {
			int p = arr[left];
			int l = left;
			int r = right;
			while(l <= r) {
				while(arr[l] < p) l++;
				while(arr[r] > p) r--;
				
				if(l<=r) {
					int tmp = arr[l];
					arr[l] = arr[r];
					arr[r] = tmp;
					l++;
					r--;
				}
			}
			
			quickSort(arr, left, r);
			quickSort(arr, l, right);
		}
	}



	
	/**
	 * 配列の値を順に出力するメソッドです。
	 * 
	 * @param arr 出力対象の配列。
	 * @return 計算結果を配列で返します。
	 */
	public static void arrayPrintln(int[] arr) {
		
		// 配列の値を順に取り出し、コンソールに出力します。
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("");
	}
	
}