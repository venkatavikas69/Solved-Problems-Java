import java.util.*;

public class highestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,a,b=0;
		do {
		 n= in.nextInt();
		 a = n;
		 if(b<a) {
			 b=a;
		 }
		}while(n!=0);
		System.out.println(b);
}
}
