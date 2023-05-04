package Test;

import java.util.Scanner;

public class Serise {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n=scanner.nextInt();
	 int a=1,b=1;
	 if(n%2==0) {
		 for (int i = 1; i <=(n-2); i=i+2) {
			a=a*2;
			b=b*3;
		}
		 System.out.println(n+"element of series is="+b);
	 }
	 else {
		 for (int i = 1; i <=(n-2); i=i+2) {
				a=a*2;
				b=b*3;
			}
			 System.out.println(n+"element of series is="+a);
		 }
		
	}
	}


