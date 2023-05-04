package string1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String string=sc.next();
		boolean flag=true;
		string=string.toLowerCase();
		for(int i=0;i<string.length()/2;i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1)) {
				flag=false;
				break;
				} //end of if
			 }    //end of for loop
			if(flag)
				System.out.println("Given String is Palindrome");
			else
				System.out.println("Given String is Not palindrome");
		}// end of main method 
	} // end of class

