/*
Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.

*/
import java.util.*;
class  SpringSeason 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of months m:");
		int m=sc.nextInt();
		System.out.println("Enter the values of day d:");
		int d=sc.nextInt();
		if((m>=3 && m<=6) && d<=20){
	 System.out.println("True ");
}
else
{
System.out.println("False");
}


	}
}
