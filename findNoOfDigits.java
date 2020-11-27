import java.util.*;

public class findNoOfDigits {
	//Method 1: O(1) Time Complexity
	static double findDigits(double n) {
		return Math.floor(Math.log10(n)+1);
	}
	//Method 2: O(n) Time Complexity
	static int findDigits(int n) {
		int digit = 0;
		while(n != 0) {
			digit++;
			findDigits(n/10);
		}
		return digit;
	}
	public static void main(String[] args) {
		double n = 3259889;
		int result = (int)findDigits(n);
		int result1 = (int) findDigits(n);
		System.out.println(result);
		System.out.println(result1);
	}

}
