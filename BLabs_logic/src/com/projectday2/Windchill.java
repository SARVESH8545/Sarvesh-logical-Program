package com.projectday2;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  value of temp t");
		double t=sc.nextDouble();
		System.out.println("Enter the  value of speed v");
		double v=sc.nextDouble();
		double w=35.74+0.625*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		System.out.println("Temperature::"+t);
		System.out.println("Wind Speed::"+v);
		System.out.println("WindChill::"+w);

	}
}
