package Lessons;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		int[] h = {8, 8, 5, 7, 9, 8, 7, 4, 8 };
		System.out.println(solution(h));
	}

	static int solution(int[] H) {
		int output = 0;
		Stack<Integer> stack = new Stack<>();
		
		
		for (int i = 0; i < H.length; i++) {
			int element = H[i];
			if (stack.isEmpty()) {
				stack.push(element);
				output++;
			} else {
				System.out.println("peek " + stack.peek());
				while (!stack.isEmpty() && stack.peek() > element) {
					stack.pop();
				}
				if (!stack.isEmpty() && stack.peek() == element) {
					continue;
				} else {
					stack.push(element);
					output++;
				}
			}
		}
		
		return output;
	}
}
