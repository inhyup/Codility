package Lessons;

import java.util.regex.Pattern;

public class Interview2 {

	public static void main(String[] args) {
		String s = "DDD";
		
		System.out.println(solution(s));

	}
	
	static String solution(String S) {
        String output = "";
        if (S == null) {
            return output;
        }
        if (!S.matches("^[ABC]*$"))
        {
        	return "";
        }
        		
        output = S.replace("AB", "AA").replace("BA", "AA").replace("CB", "CC").replace("BC", "CC").replace("AA", "A").replace("CC", "C");

	    if (S.equals(output)) {
	    	return output;
	    } else {
	    	return solution(output);
	    }
	        
	}
	
	

}
