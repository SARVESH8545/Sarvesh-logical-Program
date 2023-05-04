package com.bjs;

import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the case Number");
		int swtcase=scanner.nextInt();
		System.out.println("Enter the first value:");
		int n1=scanner.nextInt();
		System.out.println("Enter the second value:");
		int n2=scanner.nextInt();
		switch (swtcase) {
		case 1:
			int add=n1+n2;
			System.out.println("Addition is :"+add);
			break;
		case 2:
			int sub=n1-n2;
			System.out.println("Subtraction is :"+sub);
			break;
			
		case 3:
			int mul=n1*n2;
			System.out.println("Multiplication is :"+mul);
			break;
		case 4:
			int div=n1/n2;
			System.out.println("Divsion is :"+div);
			break;
		default:
			System.out.println("Invalid operation ");
		}
	}

}
