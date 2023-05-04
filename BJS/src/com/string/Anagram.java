package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="sarvesh";
		String s2="veshsar";
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a, b);
		if (result==true) {
			System.out.println("Anagram");
		}		else {
			System.out.println("Not Anagram");
		}
	}

}
