import java.util.Scanner;

public class Caesar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the key: ");
		int key = in.nextInt();
		in.nextLine();
		System.out.print("Enter the message: ");
		String s = in.nextLine();
		char[] a = s.toCharArray(); // converting string to char array
		int n = a.length;
		char[] b = new char[n];

		for (int i = 0; i < n; i++) {
			char c = a[i];
			int num = c;
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				if (c >= 65 && c <= 90) { // checking if it is uppercase
					int newkey = num + key; // adding key given
					if (newkey > 90) { // checking if its out of range
						int sub = (newkey - 90) + 64; // rotating the digit for ex: if letter z and key is 2 then new letter is b
						b[i] = (char) (sub);
					} else {
						b[i] = (char) (newkey);
					}
				} else if (c >= 97 && c <= 122) {
					int newkey = (num + key);
					if (newkey > 122) {
						int sub = (newkey - 122) + 96;
						b[i] = (char) (sub);
					} else {
						b[i] = (char) (newkey);
					}
				}
			} else {
				b[i] = c;
			}
		}

		System.out.print("Encrypted message: ");
		for (char c : b) {
			System.out.print(c);
		}
	}

}
