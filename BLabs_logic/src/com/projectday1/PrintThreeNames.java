package com.projectday1;
import java.util.*;
public class PrintThreeNames
{

	public static void main(String[] args) 
	{
		System.out.println("hi");
		for(int i=args.length-1;i>0;i--) 
		{
			System.out.println(args[i]+",");

			{	
				System.out.println("and"+args[i]+".");
			}
		}
	}
}
