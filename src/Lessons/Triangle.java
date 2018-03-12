package Lessons;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		int[] a = { 10, 2, 5, 1, 8, 20 };
		int[] b = { 10, 50, 5, 1 };
		
		System.out.println(solution(b));
	}
	
	
	static int solution(int[] A) {
		int output = 0;
		int N = A.length;
		if (N < 3) {
			return output;
		}
		Arrays.sort(A);
		for (int i = 0; i < N-2; i++) {
			if ((long)A[i] + (long)A[i+1] > (long)A[i+2] && (long)A[i+1] + (long)A[i+2] > (long)A[i] && (long)A[i+2] + (long)A[i] > (long)A[i+1]) {
				output = 1;
			}
		}

		return output;
	}
}
