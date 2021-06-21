import java.util.*;

class change {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num = n;
		int ten = 0, five = 0, two = 0, one = 0;
		while(num > 0) {
			if(num >= 10) { 
				num -= 10;
				ten++;
			}
			else if(num >= 5) {
				num -= 5;
				five++;
			}
			else if(num >= 2) {
				num -= 2;
				two++;
			}
			else {
				num--;
				one++;
			}
		}
		System.out.println("10 x" + ten + " times=" + (10 * ten));
		System.out.println("5 x" + five + " times=" + (5 * five));
		System.out.println("2 x" + two + " times=" + (2 * two));
		System.out.println("1 x" + one + " times=" + (1 * one));
		System.out.println("totally"+(n));
	}
}
