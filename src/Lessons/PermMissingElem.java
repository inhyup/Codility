package Lessons;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		int[] a = {2, 3, 1, 5};
		System.out.println(solution(a));
	}
	
	static int solution (int[] A) {
		int output = 0;

		
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) {
			if (A[i+1] - A[i] > 1) {
				output = A[i+1] - 1;
			}
		}
		return output;
	}
	
	
	static int solution2 (int[] A) {
	    long N = A.length + 1;
	    long total = (N * (N + 1)) / 2;

	    long sum = 0L;

	    for (int i : A) {

	        sum += i;
	    }

	    return (int)(total - sum);
	}

}
