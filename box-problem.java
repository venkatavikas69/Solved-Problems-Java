/*
There are two boxes on the table. The first box has a size of X1 x Y1 x Z1, and the second box has a size of X2 x Y2 x Z2. You need to determine which box can be put inside another box. You can rotate both boxes as you want.


Input contains two lines.
The first line contains numbers X1, Y1, Z1, the second line contains numbers X2, Y2, Z2. All numbers are integers and greater than 0.

 

If the sizes of the boxes are equal, output "Box 1 = Box 2".

If the first box can be put inside the second box, output "Box 1 < Box 2".

If the second box can be put inside the first box, output "Box 1 > Box 2".

If none of the boxes can be put inside the other box, output "Incomparable"

*/

package jetbrains;
import java.util.*;

public class solution {
	
	//Implementation of sorting algorithm
	
	static void selectionSort(int arr[]) {
		for (int i = 0; i < 2; i++) {
			int min_index = i;
			for (int j = i+1; j < 3; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
					int temp = arr[min_index];
					arr[min_index] = arr[i];
					arr[i] = temp;
				}
			}	
		}
	}

	public static void main(String[] args) {
		
		//program to check if one box fits into another box

		Scanner sc = new Scanner(System.in);
		int equal=0,less=0,high=0;

		int[] a = new int[3];
		int[] b = new int[3];
		
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < 3; i++) {
			b[i] = sc.nextInt();
		}
		
		selectionSort(a);
		selectionSort(b);
		
		if(a[0]==b[0] && a[1] == b[1] && a[2] == b[2]) {
			System.out.println("box1 = box2");
		}else if(a[0] < b[0] && a[1] < b[1] && a[2] < b[2]) {
			System.out.println("box1 < box2");
		}else if(a[0] > b[0] && a[1] > b[1] && a[2] > b[2]) {
			System.out.println("box1 > box2");
		}else {
			System.out.println("Incomparable");
		}
	}

}
