package Lessons;

public class CyclicRotation {

	public static void main(String[] args) {
		int[] a = { 3, 8, 9, 7, 6 };
		int k = 3;
		
		solution(a, k);
	}
	
	static int[] solution(int[] A, int K) {
		if (A.length == 0 || K == 0) {
			return A;
		}
		
		for (int j = 0; j < K; j++) {
			int temp = A[A.length-1];
			for (int i = A.length-1; i > 0; i--) {
				A[i] = A[i-1];
			}
			A[0] = temp;			
		}
		
		return A;
	}
	
	
}
