package com.twoD.array;

import java.util.Scanner;



public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array row size: ");
		int row =scanner.nextInt();
		System.out.println("Enter Array column size: ");
		int col=scanner.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter array element ");
		for (int i = 0; i<row; i++) {
			for (int j = 0; j <col; j++) {
				arr[i][j]=scanner.nextInt();

			}

		}

		System.out.println("Original Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Transpose Array");
		for (int i = 0; i <col; i++) {
			for (int j = 0; j <row; j++) {
				System.out.print(arr[j][i]+" ");

			}
			System.out.println();

		}


	}

}
