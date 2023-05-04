package com.bjs;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length value");
		int a_length=sc.nextInt();
		System.out.println("Enter width value");
		int b_width=sc.nextInt();

		// case1
          System.out.println("Case 1");
		double x=a_length*b_width;
		System.out.println("Area of ractangle :"+x);

		System.out.println("Enter raduis");
		int r_raduis=sc.nextInt();

		// case 2
		System.out.println("Case 2");
		double y=(Math.PI)*r_raduis*r_raduis;
		System.out.println("Area of cricle :"+y);

		// case 3
      System.out.println("Case 3");
		double z=(Math.pow(x, 2)+Math.pow(y, 2)+2*x*y)/(Math.pow(x, 2)+Math.pow(y, 2));

		System.out.println("Z value is :"+z);

		//case 4
    System.out.println(" Case 4");
		String msg=(z/5==0 && z/10==0)?"I am honest":"Serious Student";

		System.out.println("Message is :"+msg);



	}

}
