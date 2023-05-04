package com.jan;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n=scanner.nextInt();
		int ar[]=new int[n];
		int temp;
		System.out.println("Enter Array Element");
		for (int i = 0; i <n; i++) {
			ar[i]=scanner.nextInt();
		}
		System.out.println("Selection algo");
		for (int i = 0; i <n; i++) {
			for (int j =i+1; j <n; j++) {
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}

			}			
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
