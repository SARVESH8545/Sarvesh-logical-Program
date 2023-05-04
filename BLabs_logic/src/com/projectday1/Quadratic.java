package com.projectday1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a:");
		double a=sc.nextDouble();
		System.out.println("Enter the values of b:");
		double b=sc.nextDouble();
		System.out.println("Enter the values of c:");
		double c=sc.nextDouble();
		double delta=((b*b)-(4*a*c));
		double sqrt=Math.sqrt(delta);
		if(delta!=0)
		{
			double root1=0,root2=0;
			 root1=(-b+sqrt)/(2*a);
			 root2=(-b-sqrt)/(2*a);
			System.out.println("Roots are:"+root1+"and"+root2);
			}
		else if(delta==0){
				System.out.println("roots is::"+(-b+sqrt/(2*a)));
				}else {
					System.out.println("");
				}
	}

}

