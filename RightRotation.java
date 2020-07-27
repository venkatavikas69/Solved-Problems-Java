import java.util.*;
class RightRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
   
    	String str = in.nextLine();
    	int n = in.nextInt();
    	
    	String[] arr = str.split(" ");
    	
    	int length = arr.length;
    	length = Math.abs(n%length);
    	
    	if(n>length) {
    		n = length;
    	}
    	
    	String[] arr1 = new String[n];
    	String[] arr2 = new String[n];
    	String[] merge = new String[arr.length];
    	String[] cut = new String[Math.abs(arr.length-n)];;
    	
    	int l =0;
    	int k = (arr.length-n)-1;
    	
    	for(int i = 0;i<=k;i++) {
    		cut[i] = arr[l];
    		l++;
    	}
    	
    	int len = arr.length-1;
    
    	for(int i=0;i<n;i++) {
    		arr1[i] = arr[len-i];
    	}
    	
    	for(int i=0;i<n;i++) {
        	arr2[i] = arr1[(n-i)-1];
        	}
    	
    	int i =0;
    	
    	for(String a: arr2) {
    		merge[i] = a;
    		i++;
    	}
    	
    	for(String a: cut) {
    		merge[i] = a;
    		i++;
    	}
    	
    	for(String a : merge) {
    		System.out.print(a+" ");
    	}
    	
    }
}
