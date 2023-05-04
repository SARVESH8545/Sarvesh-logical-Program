package com.projectday1;

public class Wpattern {

	public static void main(String[] args) {
		int i,j,k,count=0;
		for(i=0;i<=11;i++) 
		{
			for(j=0;j<=1;j++)
			{
				System.out.print("*");
			}
			for(k=10;k>=i;k--) 
			{
				System.out.print(" ");
			}
			for(j=0;j<=1;j++) 
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("  ");
			}
			for(j=0;j<=1;j++) 
			{
				System.out.print("*");
			}
			for(k=10;k>=i;k--) 
			{
				System.out.print(" ");
			}
			for(j=0;j<=1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
