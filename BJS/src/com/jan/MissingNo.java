package com.jan;
// write a program find out missing number
public class MissingNo {

	public static void main(String[] args) {
		int ar[]= {1,2,3,5,6};
		int n=ar.length;
		int total=(n+1)*(n+2)/2; //21
		for (int i = 0; i <n; i++) {
			total=total-ar[i];
			}
		System.out.println(total);

	}

}
