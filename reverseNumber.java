import java.util.*;

public class reverseNumber {
	
	    public static void main(String[] args) {
	    	
	        Scanner in = new Scanner(System.in);

	        int n = in.nextInt(), reversed = 0;
	        
	        while(n != 0) {
	        	int digit = n % 10;
	        	reversed = reversed * 10 + digit;
	        	n /= 10;	
	        }   
	        
	        System.out.println(reversed); 
	}		
}
