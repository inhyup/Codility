package Challenges;

import java.util.HashMap;
import java.util.Map;

public class Ferrum2018 {

	public static void main(String[] args) {
		int[] a = {-1, -1, 1, -1, 1, 0, 1,-1, -1};
		int[] b = {1, 1, -1, -1, -1, -1, -1, 1, 1};
		System.out.println(solution(b));

	}

	
	static int solution(int[] A) {
		int output = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum >= 0) {
				output = i + 1;
			}
			else if (map.containsKey(sum)) {
				//System.out.println(map.get(sum));
				output = Math.max(output, i - map.get(sum));
			}
			else {
				map.put(sum, i);
			}
		}	
		return output;
		
	}
}
