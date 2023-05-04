package com.arrayassignement;

/*15. Write a Java program, create one Java application.
Name of the program is Calculator, where we have functions like
addition, subtraction, multiplication, division, modulus, percentage,
sin, cos and tan.
*/
public class Question15 {
	static void addition(int a,int b) {
	System.out.println("Addition :"+(a+b));	
	}
	static void subtraction(int a,int b) {
		System.out.println("Subtraction :"+(a-b));	
		}
	static void multiplication(int a,int b) {
		System.out.println("Multiplication :"+(a*b));	
		}
	static void division(int a,int b) {
		System.out.println("Division :"+a/b);	
		}
	
	static void percentage(int a,int b,int c,int d,int e) {
		System.out.println("Percentage :"+((a+b+c+d+e)/5)+"%");	
		}
	static void sin(double a) {
		double d=Math.toRadians(a);
		System.out.println("Sine: "+Math.sin(d));
	}
	static void cos(double a) {
		double d=Math.toRadians(a);
		System.out.println("Cosine :"+Math.cos(d));
	}
	static void tan(double a) {
		double d=Math.toRadians(a);
		System.out.println("Tan :"+Math.tan(d));
	}
	
	

	public static void main(String[] args) {
		addition(10,20);
		subtraction(30, 20);
		multiplication(5, 5);
		division(15, 5);
		percentage(60, 80, 50, 90, 100);
		sin(90);
		cos(0);
		tan(45);
		

	}

}
