package com.bjs;

import java.util.Scanner;

public class ConditionaloperatorMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		String grade=(marks>=60 && marks<=100)?"First division":"Fail";
		System.out.println(grade);

	}

}
