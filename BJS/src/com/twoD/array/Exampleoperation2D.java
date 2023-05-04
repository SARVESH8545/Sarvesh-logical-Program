package com.twoD.array;

import java.util.Scanner;

public class Exampleoperation2D {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array Row:");
		int r=scanner.nextInt();
		System.out.println("Enter Array Column:");
		int c=scanner.nextInt();
		System.out.println("Enter array element for 1st Array: ");
		int a[][]=new int[r][c];

		for (int i = 0; i <r; i++) {
			for (int j = 0; j <c; j++) {
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter array element for 2nd Array: ");
		int b[][]=new int[r][c];
		for (int i = 0; i <r; i++) {
			for (int j = 0; j <c; j++) {
				b[i][j]=scanner.nextInt();
			}
		}

		int C[][]=new int[r][c];

		for (int i = 0; i <r; i++) {
			for (int j = 0; j <c; j++) {
				C[i][j]=a[i][j]+b[i][j];

			}

		}
		System.out.println("Addition of Array a and b: ");
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				System.out.print(C[i][j]+" ");

			}
			System.out.println();
		}
		// for x
		int x=0;
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				x=C[2][1]+C[1][0]+C[1][1];
			}

		}
		System.out.println("X: "+x);
		// for y
		int y=0;
		for (int i = 0; i < C.length; i++) {
			for (int j = 0; j < C.length; j++) {
				y=C[0][0]+C[2][0]+C[0][2];
			}

		}
		System.out.println("Y: "+y);

		System.out.println("1D Array :");
		int array[]= {9,6,x,y};

		for (int i = 0; i < array.length; i++) {
			if (array[i]==x) {
				System.out.println("Search element is x: "+x);

			}

		}






	}

}
