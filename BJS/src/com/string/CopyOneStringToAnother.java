package com.string;
// WAP copying a string to another string
public class CopyOneStringToAnother {

	public static void main(String[] args) {
		String string1="Sarvesh Pandey";
		char c[]=string1.toCharArray();
		int size=c.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[i]=c[i];
			++i;
		}
		//System.out.println(string1);
		System.out.println(a);
		}

}
