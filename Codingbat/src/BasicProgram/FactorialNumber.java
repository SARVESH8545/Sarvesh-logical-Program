package BasicProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
//		int fact=1;
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			fact= fact*i;
//		}
//		System.out.println("Factorial is::"+fact);
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a Number");
 int n=sc.nextInt();
 int fact=1;
 for (int i = 1; i<=n; i++) {
 fact=fact*i;	
}
 System.out.println("Factorial Number is:"+fact);
	}

}
