package Lessons;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

	public static void main(String[] args) {
		int[] a = { 3, 4, 4, 4, 4, -1, 3, 4 };
		System.out.println(solution(a));
		
	}
	
	static int solution(int[] A) {
		int output = -1;
		int counter = 0;
		int candidate = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (counter == 0) {
				candidate = i;
			}
			
			if (A[i] == A[candidate]) {
				counter++;
			} else {
				counter--;
			}
			
		}
		
		counter = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == A[candidate]) {
				counter++;
			}
		}
		
		return counter > A.length/2 ? candidate : -1;
		
	}

}
