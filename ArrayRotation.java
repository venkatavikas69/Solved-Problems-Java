/* This code is written for rotating 2d array 90 degrees */
import java.util.*;

public class ArrayRotation {
	
    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        int[][] arr = new int[a][b];
        int[][] arr1 = new int[b][a];
        int[][] arr2 = new int[b][a];

        //input to the arr
        for(int i=0; i<a; i++) {
            for(int j = 0; j<b; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Rotated: ");        
        
        //converted from N x M --> M x N
        for (int i = 0; i < a; i++) {
			for (int j = b-1; j >=0 ; j--) {
				arr1[j][i] = arr[i][j];
			}
		}
        
        //inverse M x N array 
        for(int i = 0; i < b; i++) {
        	
        	int start = 0;
        	int end = a-1;
        	
        	while(start <= end) {
        		int temp = arr1[i][start];
        		arr2[i][start] = arr1[i][end];
        		arr2[i][end] = temp;
        		start++;
            	end--;
        	}
        	
        }
        
        //output the M x N array
        for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
    
	}
}
