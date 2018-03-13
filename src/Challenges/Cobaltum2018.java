package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cobaltum2018 {

	public static void main(String[] args) {
		
		int[] a = { 5, 3, 7, 7, 10 };
		int[] b = { 1, 6, 6, 9, 9 };

		int[] c = { 5, -3, 6, 4, 8 };
		int[] d = { 2, 6, -5, 1, 0 };
		
		int[] e = { 1, 6, 7, 10, 12 };
		int[] f = { 3, 2, 5, 9, 10};

		
		int[] g = { 1, 2, 3, 4, 5};
		int[] h = { 3, 1, 5, 6, 8};

		System.out.println(solution2(a, b));
	}
	
	//22%
	static int solution(int[] A, int[] B) {
		
		if (A.length != B.length)
		{
			return -1;
		}
		
		boolean isA = false;

		for (int i = 1; i < A.length; i++) {
			if (A[i] > A[i-1] && B[i] > B[i-1]) {
				isA = true;
			}
			else {
				isA = false;
				break;
			}		
		}
		
		int temp = 0;
		int count = 0;
		
		if (isA) {
			return 0;
		} else {
			for (int i = 0; i < A.length-1; i++) {
				if (A[i] >= A[i+1]) {
					temp = A[i];
					A[i] = B[i];
					B[i] = temp;
					count++;
				}
				else if (B[i] >= B[i+1]) {
					temp = B[i];
					B[i] = A[i];
					A[i] = temp;
					count++;
				}
			}
			
			for (int i = 1; i < A.length; i++) {
				if (A[i] > A[i-1] && B[i] > B[i-1]) {
					isA = true;
				}
				else {
					isA = false;
					break;
				}
			}
		}
		
		if (!isA) {
			return -1;
		}

		return count;
	}
	
	static int solution2(int[] A, int[] B) {
		int output = 0;
		
		if (A.length != B.length) {
			return -1;
		}
	
		Map<Integer, Integer> aMap = new HashMap<>();
		Map<Integer, Integer> bMap = new HashMap<>();
		ArrayList<Integer> aList = new ArrayList<>();
		
		for (int i = 0; i < A.length; i++) {
			aMap.put(i, A[i]);
			bMap.put(i, B[i]);
			
			aList.add(A[i]);
		}
		
	
		System.out.println(aList);
		
		System.out.println(aMap.values());
		
		for (Map.Entry<Integer, Integer> entry : aMap.entrySet()) {
			//System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		return output;
		
	}
	
	

}
