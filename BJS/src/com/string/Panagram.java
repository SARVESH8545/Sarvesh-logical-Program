package com.string;

public class Panagram {

	public static void main(String[] args) {
		String string="the quick brown fox jumps over a lazy dog";
		string=string.replace(" ","");
		char c[]=string.toCharArray();
		int size=c.length;
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,
				  0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while(i!=size) {
			int index=c[i]-32;
			a[index]=1;
			++i;
		}
		i=0;
		while(a[i]==26) {
			if (a[i]==1) {
				++i;
				
			}else {
				System.out.println("Not Panagram");
				System.exit(0);
			}
		}
		System.out.println("Panagram ");
	}

}
