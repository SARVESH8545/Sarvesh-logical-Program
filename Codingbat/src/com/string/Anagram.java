package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Brag";
		String s2="Grab";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()!=s2.length()) {
        	System.out.println("Not An Anagram");
			
		}else {
			char []st1=s1.toCharArray();
			char []st2=s2.toCharArray();
			Arrays.sort(st1);
			Arrays.sort(st2);
			if (Arrays.equals(st1, st2)==true) {
				System.out.println("Both the string are Anagram");			
			}else {
				System.out.println("Both the String are Not an Anagram");
			}
		}

	}

}
