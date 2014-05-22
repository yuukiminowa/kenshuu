package src.main.java;

public class Question2 {

	public static void main(String[] args) {
		// ソート対象となる配列です。
		int[] arr = {5, 4, 2, 3, 8, 7, 1, 0, 6, 9};
		
		// ソート前の値をコンソールに出力します。
		System.out.print("ソート前：");
		arrayPrintln(arr);
		
		// ソートを実行します。
		quickSort(arr,0,9);
		
		// ソート後の値をコンソールに出力します。
		System.out.print("ソート後：");
		arrayPrintln(arr);
	}
	
	/**
	 * クイックソートを行うメソッドです。
	 * ここに実装してください。
	 */
	public static void quickSort(int array[],int kaishi,int owari) {
		int i=kaishi;
		int j=owari;
		int pivot;
		int tmp;
		pivot=array[(i+j)/2];
		while(i<j)
		{		
			
		
		while(array[i]<pivot){
			i++;
		}
		while(array[j]>pivot){
			j--;
		}
		if(i>=j)break;
			tmp=array[i];
			array[i]=array[j];
			array[j]=tmp;
			i++;
			j--;
		}
		
		if(kaishi<i-1){
			quickSort(array,kaishi, i-1);
		}
		if(j+1<owari){
			quickSort(array,j+1, owari);
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