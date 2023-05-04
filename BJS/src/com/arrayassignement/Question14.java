package com.arrayassignement;

import java.util.Arrays;

/*14. Write a Java program, create 1D array. 
Sort the array data by the help of any sorting 
algorithm and pre-defined functions.
 */
public class Question14 {

	public static void main(String[] args) {
		int a[]= {10,30,50,40,80,90,20};
		//		Arrays.sort(arr);
		//		for (int i : arr) {
		//			System.out.println(i);
		//			
		//		}

		// Bubble sort
		for (int i = 0; i < a.length; i++) {
			for (int j =0; j < a.length-1-i; j++) {
				int temp=0;
				if (a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}				
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
