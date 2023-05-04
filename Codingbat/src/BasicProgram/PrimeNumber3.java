package BasicProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no to check prime no");
		int n=sc.nextInt();
		BigInteger b= BigInteger.valueOf(n);
		if(b.isProbablePrime(2345)==true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}
