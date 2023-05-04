package com.bjs;

import java.util.Scanner;

public class VoterId {

	public static void main(String[] args) {
		System.out.println("Enter age :");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		System.out.println("Enter id :");
		int id=scanner.nextInt();
		if (age>=18) {
			
			//System.out.println(" ");
		if (id<=100) {
			System.out.println("you can proceed ");
			
		}else {
			System.out.println("sorry you are not Eligible ");
		}
		
		}else {
			System.out.println("voterId is wrong");
		}

		}	
	
	}


