package BasicProgram;
// WAP to print 1st n prime number from Starting number sn.
import java.math.BigInteger;
import java.util.Scanner;

public class primenumber6 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Starting Number:");
	int sn=sc.nextInt();
	int c=0;
	System.out.println("Enter the n values:");
	int n=sc.nextInt();
	
	for(int i=sn; ;i++) {
	BigInteger b=BigInteger.valueOf(i);
	if(b.isProbablePrime(63)) 
	{
		System.out.println(i);
		c++;
	}
	if(c==n)
		break;
	}
	}

}
