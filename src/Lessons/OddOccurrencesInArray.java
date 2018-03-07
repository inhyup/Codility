package Lessons;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {
	public static void main(String[] args) {
		int[] a = {9, 3, 9, 3, 9, 7, 9 };
		
		System.out.println(2^3);
		System.out.println(solution(a));
	}
	
	
	static int solution(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		
		for (int i = 0; i < A.length; i++) {
			int count = 0;
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return A[i];
			}
		}
		return 0;
	}
	
	
	static int solution2(int[] A) {
		int output = 0;
		for (int i = 0; i < A.length; i++) {
			output ^= A[i];
		}
		return output;
	}
}
