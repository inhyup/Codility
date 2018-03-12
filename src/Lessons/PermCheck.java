package Lessons;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

	public static void main(String[] args) {
		
		int a[] = {4, 1, 3, 2};
		
		System.out.println(solution(a));
	}
	
	static int solution(int[] A) {
        final Set perm = new HashSet();
        final int size = A.length;

        for(int number : A)
        {
            if(number > size)
                return 0;

            perm.add(number);
        }

        if(perm.size() == A.length)
            return 1;
        else
            return 0;
	}

}
