package com.projectday2;

import java.util.Scanner;

/* Write a program ​Trig.java to illustrate various trigonometric functions in the Math         
 *library, such as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an           
 * angle (in degrees), converts to radians, and then performs various trigonometric calculations*/
public class Trig{

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter angle in degrees::");
		double deg=sc.nextDouble();
		double rad=Math.toRadians(deg);
		double sinval=Math.sin(rad);
		double cosval=Math.cos(rad);
		double tanval=Math.tan(rad);
		System.out.println("sin("+deg+")="+sinval);
		System.out.println("sin("+deg+")="+cosval);
		System.out.println("sin("+deg+")="+tanval);
	}

}
