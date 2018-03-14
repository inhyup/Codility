package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		int[] i = { 1, 5, 6 };
		int[] j = { -2, 0, 2 };

		int[] k = { 3, 5, 6, 8 };
		int[] l = { 4, 4, 7, 7 };
		
		int[] m = { 4, 4, 4};
		int[] n = { 3, 3, 3};
		
		
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
	
	//33%
	static int solution2(int[] A, int[] B) {
		int count = 0;
		int temp = 0;
		ArrayList<Integer> aList = new ArrayList<>();
		ArrayList<Integer> bList = new ArrayList<>();
		
		ArrayList<Integer> aResultList = new ArrayList<>();
		ArrayList<Integer> bResultList = new ArrayList<>();

		int[] tempArray = new int[A.length];
		
		if (A.length != B.length) {
			return -1;
		}
		
		if (A.length == 0 || B.length == 0) {
			return 0;
		}
		
		if (A[0] < B[0]) {
			tempArray = A;
			A = B;
			B = tempArray;
		}
		
		for (int i = 0; i < A.length; i++) {
			aList.add(A[i]);
			bList.add(B[i]);
			aResultList.add(A[i]);
			bResultList.add(B[i]);
		}
		
		Collections.sort(aList);
		Collections.sort(bList);
		
		boolean isSame = false;
		
		if (aList.equals(aResultList) && bList.equals(bResultList)) {
			for(int i = 1; i < A.length; i++) {
				if (A[i] == A[i-1] || B[i] == B[i-1]) {
					isSame = true;
				}
			}
			if (isSame == false) {
				return 0;
			}
		}
		
		
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] < B[i]) {
				count++;
				temp = A[i];
				A[i] = B[i];
				B[i] = temp;
			} 
		}
		
		aList.clear();
		bList.clear();
		aResultList.clear();
		bResultList.clear();
		
		for (int i = 0; i < A.length; i++) {
			aList.add(A[i]);
			bList.add(B[i]);
			aResultList.add(A[i]);
			bResultList.add(B[i]);
		}
		
		Collections.sort(aList);
		Collections.sort(bList);
		
		
		isSame = false;
		if (aList.equals(aResultList) && bList.equals(bResultList)) {
			for(int i = 1; i < A.length; i++) {
				if (A[i] == A[i-1] || B[i] == B[i-1]) {
					isSame = true;
				}
			}
			if (isSame == false) {
				return count;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}

	}
	
	

}
