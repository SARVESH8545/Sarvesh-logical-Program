/* Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a)
Root 2 of x = (-b - sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.
*/
import java.util.*;
class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of a::");
		int a=sc.nextInt();
		System.out.println("Enter the Value of b::");
		int b=sc.nextInt();
         System.out.println("Enter the Value of c::");
		int c=sc.nextInt();
		char  x;
		String eq="a*x*x+b*x+c";
		System.out.println("equation::  "+eq);
		float delta =b*-4*a*c;
		System.out.println("Root 1 of x:"+(-b + Math.sqrt(delta))/(2*a));
        System.out.println("Root 1 of x:"+(-b - Math.sqrt(delta))/(2*a));




	}
}
