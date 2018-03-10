package Lessons;

public class FrogJmp {

	public static void main(String[] args) {
		int x = 10;
		int y = 85;
		int d = 30;
		
		System.out.println(solution(x, y, d));
		
	}
	
	static int solution(int X, int Y, int D) {
		int output = 0;
		int i = 0;
		while (X + (D * i) < Y) {
			i++;
			output = i;
		}

		return output;
	}
	
	static int solution2 (int X, int Y, int D) {
		int diff = Y - X;
		if (diff % D == 0) {
			return diff / D;
		}
		else {
			return diff / D + 1;
		}
	}

}
