package Lessons;

public class BinaryGap {

	public static void main(String[] args) {
		int n = 20;
		System.out.println(solution(n));
	}
	
    static public int solution(int N) {
    	int result = 0;    	
    	String binary = Integer.toBinaryString(N);
    	//System.out.println(binary);
    	int count = 0;
    	char[] toChar = binary.toCharArray();
    	int temp = 0;
    	for(int i = 0; i < binary.length(); i++)
    	{

    		if (toChar[i] == '0')
    		{
    			count++;
    		}    		
    		if (toChar[i] == '1')
    		{
    			temp = count;
    			count = 0;
    			
    			if (temp > result)
    			{
    				result = temp;
    			}
    		}
    		
    	}
    	
    	return result;
    }

}
