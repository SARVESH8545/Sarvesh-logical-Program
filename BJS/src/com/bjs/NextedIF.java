package com.bjs;

import java.util.Scanner;

public class NextedIF {

	public static void main(String[] args) {
	System.out.println("Enter age :");
	Scanner scanner=new Scanner(System.in);
	int age=scanner.nextInt();
	System.out.println("Enter height :");
	double hight=scanner.nextDouble();
	if (age>=18) {
		
		//System.out.println(" ");
	if (hight>=5.5) {
		System.out.println("you are selected ");
		
	}else {
		System.out.println("sorry your height is short ");
	}
	
	}else {
		System.out.println("sorry you are too young ");
	}

	}

}
