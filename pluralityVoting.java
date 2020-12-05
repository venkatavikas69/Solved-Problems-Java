import java.util.Scanner;

class voting {

	public String name;
	public int count;

	public candidate(String name) {
		super();
		this.name = name;
	}

}

public class DayScholar {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		candidate[] candidates = new candidate[3];
		candidates[0] = new candidate("vikas");
		candidates[1] = new candidate("ganesh");
		candidates[2] = new candidate("teja");

		System.out.print("No. of voters : ");
		int voters = in.nextInt();
		in.nextLine();
		for (int i = 0; i < voters; i++) {
			System.out.print("vote : ");
			String name = in.nextLine().toLowerCase();
			int matchingIndex = -1; // -1 = not found
			for (int j = 0; j < 3; j++) {
			    if (name.equals(candidates[j].name)) {
			        matchingIndex = j;
			        break;
			    }
			}
			if (matchingIndex == -1) {
			    System.out.println("Not valid");
			    voters++;	
			} else {
			    candidates[matchingIndex].count++;
			}
		}

		int highest = 0;
		String winner = "";
		for (int i = 0; i < 3; i++) {
			if (candidates[i].count > highest) {
				highest = candidates[i].count;
				winner = candidates[i].name;
			} else if (candidates[i].count == highest) {
				winner += ("\n" + candidates[i].name);
			}
		}

		System.out.println(winner);
	}
}
