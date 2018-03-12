package Lessons;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		
		int n = 5;
		int[] a = {3, 4, 4, 6, 1, 4, 4};
		System.out.println(solution2(n, a));
	}
	
	static int[] solution(int N, int[] A) {
		int[] output = new int[N];
		int biggestNum = 0;
		
		for (int i = 0; i < A.length; i++) {	
			int max = Arrays.stream(output).max().getAsInt();
			if (A[i] > N) {
				for(int j = 0; j < output.length; j++) {
					output[j] = max;
				}
			}
			else {
				output[A[i]-1]++;
			}
		}
		
//		for (int i = 0; i < output.length; i++) {
//			System.out.println(output[i]);
//		}
		
		return output;
	}
	
	
	static int[] solution2(int N, int[] A) {
		int[] output = new int[N];
		int max = 0;
		int base = 0;
		
		for (int a : A) {
			if (a > output.length) {
				base = max;
			}
			else {
				if (output[a-1] < base) {
					output[a-1] = base;
				}
				output[a-1]++;
				max = Math.max(max, output[a-1]);
			}
		}
		
		for (int i = 0; i < output.length; i++) {
			if (output[i] < base) {
				output[i] = base;
			}
		}
		
		return output;
		
	}
	
	

}
