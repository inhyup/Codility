package Lessons;

public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		int[] a = { 3, 2, 6, -1, 4, 5, -1, 2 };
		int[] b = { 0, 1, 2, 3, 4, 5, 6, 7};
		int[] c = { 0, -5, 5, 6, -3, 7, 8, -3 };
		int[] d = { 0, 5, 3, -3, -1, 4, -5, 1 };
		int[] e = { 0, 5, 3, -3, -5, 4, -5, 1 };
		System.out.println(solution(e));
	}

	static int solution (int[] A) {

		int sum = 0;
		
		int[] K1 = new int[A.length];
		int[] K2 = new int[A.length];
		
		for (int i = 1; i < A.length-1; i++) {
			K1[i] = Math.max(K1[i-1] + A[i], 0);
		}
		
		for (int i = A.length-2; i > 0; i--) {
			K2[i] = Math.max(K2[i+1] + A[i], 0);
		}
		
		for (int i = 1; i < A.length-1; i++) {
			sum = Math.max(sum, K1[i-1] + K2[i+1]);
		}
		
		return sum;
	}
	
}
