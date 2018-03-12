package Lessons;


// Redo
public class FrogRiverOne {

	public static void main(String[] args) {
		int[] a = {1, 3, 1, 4, 2, 3, 5, 4 };
		int x = 5;
		System.out.println(solution(x, a));
	}
	
	static int solution(int X, int[] A) {
		int output = -1;
		
		int[] count = new int[X+1];
		int x = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (count[A[i]] == 0) {
				count[A[i]] = A[i];
				x += 1;
				if (x == X) {
					return i;
				}
			}
		}

		return output; 
	}
	

}
