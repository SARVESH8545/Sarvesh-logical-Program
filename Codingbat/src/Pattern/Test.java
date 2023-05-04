package Pattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of row/col::");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				  if(j>=n/2-i && j<=n/2+i && j>=i-n/2 && j<=n+n/2-i-1) {
					System.out.print("*");
				 }else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	}


