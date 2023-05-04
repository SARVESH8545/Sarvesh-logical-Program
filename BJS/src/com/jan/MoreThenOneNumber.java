package com.jan;

// write a program find out more then one missing number
public class MoreThenOneNumber {

	public static void main(String[] args) {
		int ar[]= {8,15,29};
		int n=ar.length;
		int data=0;

		for (int i=ar[0]; i < ar[n-1];i++) {
            if (i==ar[data]) {
            	data++;
            	continue;
				}
		System.out.print(i+" ");

		}
	}

}
