package Lessons;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String s = "";
		
		System.out.println(solution(s));

	}
	
	static int solution(String S) {
	
		Stack<Character> stack = new Stack<>();
		
		if (!S.contains("(") && !S.contains(")") && !S.contains("[") && !S.contains("]") && !S.contains("{") && !S.contains("}") && !S.isEmpty()) {
			return 0;
		}
		
		if (!(S.length() % 2 == 0)) {
			return 0;
		}
		
		if (S.isEmpty()) {
			return 1;
		}
		
		for (char c : S.toCharArray()) {
			switch (c) {
				case ')':
					if (!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					}
					else return 0;
					break;
					
				case '}':
					if (!stack.isEmpty() && stack.peek() == '{') {
						stack.pop();
					}
					else return 0;
					break;
				case ']':
					if (!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					}
					else return 0;					
					break;
					
				default:
					stack.push(c);
					break;
			}
			
		}
		
		
		return stack.size() == 0 ? 1 : 0;
	}

}
