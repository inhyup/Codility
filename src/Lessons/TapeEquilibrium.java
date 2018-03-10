package Lessons;

public class TapeEquilibrium {

	public static void main(String[] args) {
		int[] a = {3, 1, 2, 4, 3 };
		System.out.println(solution(a));
	}
	
	static int solution(int[] A) {
		int output = 0;
		int sum = 0;
		int backsum = 0;
		int[] sumArray = new int[A.length];
		int[] backsumArray = new int[A.length];
		int[] abs = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			sumArray[i] = sum;
		}
		
		for (int i = A.length-1; i >= 0; i--) {
			backsum += A[i];
			backsumArray[i] = backsum;
		}
		
		
//		for (int i = 0; i < sumArray.length-1; i++) {
//			System.out.println(sumArray[i]);
//		}
		
//		for (int i = 0; i < backsumArray.length; i++) {
//			System.out.println(backsumArray[i]);
//		}
		
		for (int i = 0; i < A.length-1; i++) {
			abs[i] = Math.abs(sumArray[i] - backsumArray[i+1]);
			
		}
		int min = abs[0];
		for (int i = 0; i < A.length-1; i++) {
			if (abs[i] < min) {
				min = abs[i];
			}
		}
		
		output = min;
		
		return output;
	}

}
