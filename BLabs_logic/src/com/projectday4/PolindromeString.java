package com.projectday4;

public class PolindromeString {

	/*public static void main(String[] args)throws Exception {
	Scanner sc=new Scanner(System.in);
	String rev="";
	System.out.println("Enter the input String");
	String str=sc.next();
	for(int i=str.length()-1;i>=0;i++) {
		 rev=rev+str.charAt(i);
	}
	if(str.equals(rev)) {
		System.out.println("Given String is Polindrome");
		}else {
			System.out.println("Given String is not Polindrome");	
		}
	}*/




	// str is a palindrome 
	static boolean isPalindrome(String str) 
	{ 

		// Pointers pointing to the beginning 
		// and the end of the string 
		int i = 0, j = str.length() - 1; 

		// While there are characters toc compare 
		while (i < j) { 

			// If there is a mismatch 
			if (str.charAt(i) != str.charAt(j)) 
				return false; 

			// Increment first pointer and 
			// decrement the other 
			i++; 
			j--; 
		} 

		// Given string is a palindrome 
		return true; 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "aba"; 

		if (isPalindrome(str)) 
			System.out.print("Yes"); 
		else
			System.out.print("No"); 
	} 
} 



