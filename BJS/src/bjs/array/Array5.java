package bjs.array;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of Subject: ");
		int n=scanner.nextInt();
		int marks[]=new int[n];
		int totalMarks=0;
		System.out.println("Enter sem marks");

		for (int i = 0; i <n; i++) {
			marks[i]=scanner.nextInt();
			totalMarks+=marks[i];
		}
		System.out.println("Total Marks: "+totalMarks);
		float per=((totalMarks)/marks.length);
		System.out.println(per+"%");
	}

}
