package Lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Distinct {

	public static void main(String[] args) {
		int[] a = { 2, 1, 1, 2, 3, 1 };
		System.out.println(solution(a));

	}
	
	static int solution(int[] A) {
		int output = 0;
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		
		output = set.size();
		
		return output;
	
	}

}
