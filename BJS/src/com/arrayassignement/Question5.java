package com.arrayassignement;

import java.util.Arrays;

/*5. Write a Java program, create 1D array {9, 2, 3, 5, 6, 7, 20}.
Find out minimum 
and maximum in between 2 to 5 index
 number.*/

public class Question5 {

	public static void main(String[] args) {

		int ar[]= {9,2,3,8,4,5,6,1,8,9};
		Arrays.sort(ar,2,7);
		String string=Arrays.toString(ar);
		System.out.println(string);
		char ch[]=string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ar[i]==ar[2]) {
				System.out.println(ar[i]);
				break;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			if (ar[i]==ar[5]) {
				System.out.println(ar[i]);
				break;

			}

		}

	}

}
