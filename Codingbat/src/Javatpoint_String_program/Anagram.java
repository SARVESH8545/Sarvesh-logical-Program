package Javatpoint_String_program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Brag";
		String s2="Grab";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("Both the String are not Anagram");
		}
		else
		{
			//converting both the arrays to character array
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			// Sorting the arrays 
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1, str2)==true)
			{
				System.out.println("Both the string are anagram");
				
			}
			else {
				System.out.println("Both the string are not anagram");
			}
		}

	}

}
