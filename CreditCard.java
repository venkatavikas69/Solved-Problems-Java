import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {
			System.out.print("Enter credit card Number :");
			String s = in.nextLine();    					//Taking Input
			long lo = Long.parseLong(s); 					//Converting to long to check for errors
			char[] a = s.toCharArray();
			int len = a.length;
			boolean valid = false;
			String cardType = "not";
			String sub = s.substring(0, 2); 			     // First Two characters

			if (len == 13 || len == 15 || len == 16) {      //Checking valid length of number

				if (sub.equals("34") || sub.equals("37") || sub.equals("51") || sub.equals("52") || sub.equals("53")
						|| sub.equals("54") || sub.equals("55") || sub.substring(0, 1).equals("4")) {

					switch (len) {
					case 13:
						if (sub.charAt(0) == '4') {
							cardType = "VISA";
						}
						break;
					case 15:
						if (sub.equals("34") || sub.equals("37")) {
							cardType = "AMEX";
						}
						break;
					case 16:
						if (sub.equals("51") || sub.equals("52") || sub.equals("53") || sub.equals("54")
								|| sub.equals("55")) {
							cardType = "MASTERCARD";
						} else if (sub.charAt(0) == '4') {
							cardType = "VISA";
						}

					}
				} else {
					System.out.println("Enter valid number");
				}
				int half = len / 2;
				char[] b = new char[half + 1];
				char[] c = new char[half + 1];
				int one = 0, two = 0;
				int sum1 = 0, sum2 = 0;

				for (int i = 0; i < len; i++) {     
					if (i % 2 == 0) {			
						b[one] = a[i];					//store numbers at even places in array b
						one++;
					} else {
						c[two] = a[i];					//store numbers at odd places in array c
						two++;
					}
				}

				for (char ch : b) {

					if (ch >= 48 && ch <= 57) {						//checking according to ascii table for numbers 1 to 9
						if ((ch - 48) * 2 > 9) {					//checking if number is double digit
							int mul = (ch - 48) * 2;				//get digit and multiply each digit by 2
							sum1 += ((mul % 10) + (mul / 10));		//if it is double digit seperate two numbers and add them
						} else {
							sum1 += (ch - 48) * 2;					//if it is single digit subtract 48 from char ascii value to get digit and multiply by 2
						}
					}
				}

				for (char ch : c) {

					if (ch >= 48 && ch <= 57) {						//adding digits at even places
						sum2 += (ch - 48);
					}
				}

				int total = sum1 + sum2;  	 //adding sum of digits at odd places plus sum of digits at even places

				if (total % 10 == 0) {		//checking last digit of total is zero or not
					valid = true;
				} else {
					System.out.println("Not Valid");
				}

			} else {
				System.out.println("Enter valid number");
			}
			System.out.println(cardType);
		} catch (Exception e) {
			System.out.println("Enter valid number");
			main(args);
		}

	}

}
