package Lessons;

import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		int[] a = {1, 3, 6, 4, 1, 2};
		
		System.out.println(solution(a));

	}

	static int solution(int[] A) {
		int output = 1;
		
		Arrays.sort(A);
		
		
		for (int i = 0; i < A.length; i++) {
			if (output < A[i]) {
				return output;
			}
			if (output == A[i]) {
				output++;
			}
		}
	
		return output;
	}
}
