package BasicProgram;

import java.math.BigInteger;
import java.util.Scanner;

//WAP to print nth prime number from given starting prime no sn
public class PrimeNumber8 {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int c=0;
 int n=5;
 int res=0;
 System.out.println("Enter the Starting number");
 int sn=sc.nextInt();
 for(int i=sn; ;i++) {
	 BigInteger b=BigInteger.valueOf(i);
	 if(b.isProbablePrime(6)) {
		 res=i;
		 c++;
	 }
	 if(c==n) {
		 break;
	 }
	 }
	 System.out.println(res);
 

	}

}
