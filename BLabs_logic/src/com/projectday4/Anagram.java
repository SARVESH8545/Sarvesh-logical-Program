package com.projectday4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String x="Heart";
		String y="Earth";
		x=x.toLowerCase();
		y=y.toLowerCase();
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a,b);
		if(result==true) {
			System.out.println("String are anagram");
		}else {
			System.out.println("String is not Anagram");
		}

	}

}
