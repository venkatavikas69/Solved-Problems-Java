import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char[] arr = s.toCharArray();
		int letters = 0, words = 1, sentences = 0;
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			char a = arr[i];
			if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
				letters++;
			} else if (a == ' ') {
				words++;
			} else if (a == '.' || a == '!' || a == '?' || a == ';') {
				sentences++;
			}
		}

		float L = ((float) letters / words) * 100;     //Average number of letters per 100 words
		float S = ((float) sentences / words) * 100;	 //Average number of sentences per 100 words
		double index = 0.0588 * L - 0.296 * S - 15.8;	 //Coleman-Liau index formula

		if (index < 16) {
			if (index < 0) {
				System.out.println("Grade 1");
			} else {
				System.out.println("Grade " + Math.round(index));
			}
		} else {
			System.out.println("Grade 16+");
		}
	}

}
