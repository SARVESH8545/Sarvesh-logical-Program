package com.bjs;

public class Range60_5 {

	public static void main(String[] args) {
		int sum=0;
		for (int i=60; i>=5; i--) {
			if (i%2==0 && i%4==0) {
				sum=sum+i;
				System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("Sum :"+sum);
	}

}
