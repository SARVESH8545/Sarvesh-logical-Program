package com.projectday3;

import java.util.Scanner;

public class Cos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter an angle in degree\n");
		double angle=sc.nextDouble();
		double radian=(angle*Math.PI)/180;
		double temp=1;
		double ans=1;
		for(int i=1;i<=2*ans;i+=2) {
			temp=temp*(-1)*angle*radian/(i*(i+1));
			ans=ans+temp;
		}
		System.out.printf("Cosine:"+ans);
	}

}
