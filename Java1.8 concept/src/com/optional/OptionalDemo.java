package com.optional;

import java.util.Scanner;

public class OptionalDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter user id");
		int userId = scanner.nextInt();
		
		User user=new User();
		String name= user.getId(userId);
		String s=name.toUpperCase()+" "+"Byee";
		System.out.println(s);
		
		

	}

}
