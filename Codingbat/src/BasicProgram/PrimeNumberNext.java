/*WAP to take integer input from user and its next prime Number.*/


package BasicProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumberNext {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no to print its next prime");
	int n=sc.nextInt(); //5
	BigInteger b=BigInteger.valueOf(n);
	System.out.println(b.nextProbablePrime()); //7
	
	}

}
