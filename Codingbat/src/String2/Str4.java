package String2;

import java.util.Arrays;

// Inbuield method  of Arrays Class 
// WAP to print array elements.
public class Str4 {

	public static void main(String[] args) {
		int arr[]= {1,2,6,5};
		//String s=Arrays.toString(arr);
		//System.out.println(s);
	Arrays.sort(arr);
	String s=Arrays.toString(arr);
	System.out.println(s);//[1, 2, 5, 6]
	}

}
