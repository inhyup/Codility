package Lessons;

public class CountDiv {

	public static void main(String[] args) {
		int a = 6;
		int b = 11;
		int k = 2;
		
		System.out.println(solution(a, b, k));
	}
	
	
	static int solution(int A, int B, int K) {
		int output = 0;
		
		output = B/K - A/K + (A%K == 0 ? 1 : 0);
		
		
		
		
//		for (int i = A; i <= B; i++) {
//			if (i % K == 0) {
//				output++;
//			}
//		}
	
		
		return output;
	}
}
