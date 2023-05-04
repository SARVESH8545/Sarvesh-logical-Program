package com.projectday1;

public class Dpattern {

	public static void main(String[] args) {
		int n=9,m=n/2,t=n;
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0||i==8||j==1)
				{
					System.out.print("*");
					
				}
			}
		for(int j=0;j<t-1;j++) 
		{
			if(i<n-1 && i>0)
			{
				System.out.print(" ");
			}
		}
		System.out.print(" ");// print space
		
	  
    System.out.print("**");
    if(i<m && i!=m) 
    {
	t++;
     }
    else if(i==m) {
	t=t-1;
     }
  else
	t--;
   System.out.println();}
	
}
}



