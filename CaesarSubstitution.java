import java.util.Scanner;

public class CaesarSubstitution {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter key of 26 Characters: ");
		char[] key = in.nextLine().toCharArray();
		int keylen = key.length;
		
		while(keylen != 26) {
			main(args);
		}
		char[] small = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char[] big = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
				'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		System.out.print("Enter message: ");
		char[] msg = in.nextLine().toCharArray();
		int msglen = msg.length;
		char[] newmsg = new char[msglen];
		int a = 0;

		for (int j = 0; j < msglen; j++) {
			char c = msg[j];	//get char at postion j in msg
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				if (c >= 65 && c <= 90) {
					for (int i = 0; i < 26; i++) {
						if (c == big[i]) {		//get the postion of j'th char in big array
							newmsg[a] = key[i];	//set the char of newmsg to the char at position j to the char at postion i in key
							a++;
						}
					}
				} else if (c >= 97 && c <= 122) {
					for (int i = 0; i < 26; i++) {
						if (c == small[i]) {
							newmsg[a] = (char) (key[i] + 32); //add 32 to convert from lowercase to uppercase
							a++;
						}
					}
				}
			} else {
				newmsg[a] = msg[a];
				a++;
			}
		}
		System.out.print("Encrypted Message :");
		for (char c : newmsg) {
			System.out.print(c);
		}

	}
}
