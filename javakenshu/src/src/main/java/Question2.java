package src.main.java;

public class Question2 {

	/**
	 * main���\�b�h�ł��B
	 * �������珈�������s���܂��B
	 */
	public static void main(String[] args) {
		// �\�[�g�ΏۂƂȂ�z��ł��B
		int[] arr = {5, 4, 2, 3, 8, 7, 1, 0, 6, 9};
		
		// �\�[�g�O�̒l���R���\�[���ɏo�͂��܂��B
		System.out.print("�\�[�g�O�F");
		arrayPrintln(arr);
		
		// �\�[�g�����s���܂��B
		quickSort(arr, 0, arr.length-1);
		
		// �\�[�g��̒l���R���\�[���ɏo�͂��܂��B
		System.out.print("�\�[�g��F");
		arrayPrintln(arr);
	}
	
	/**
	 * �N�C�b�N�\�[�g���s�����\�b�h�ł��B
	 * �����Ɏ������Ă��������B
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
	 * �z��̒l�����ɏo�͂��郁�\�b�h�ł��B
	 * 
	 * @param arr �o�͑Ώۂ̔z��B
	 * @return �v�Z���ʂ�z��ŕԂ��܂��B
	 */
	public static void arrayPrintln(int[] arr) {
		
		// �z��̒l�����Ɏ��o���A�R���\�[���ɏo�͂��܂��B
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println("");
	}
	
}