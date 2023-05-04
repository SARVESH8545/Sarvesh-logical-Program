package com.projectday1;

public class pattern {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<2||j<=n/2&&i==n/2||(i+j==n-1||i+j==n-2||i+j==n-3)&&i<=n/2||i>=n/2&&(i==j||j==i-1||j==i-2)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			
		
			System.out.println();
		}
	}

}
