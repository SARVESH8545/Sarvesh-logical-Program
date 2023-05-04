package BasicProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class primenumber4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting number");
		int sn=sc.nextInt();
		System.out.println("Enter ending number");
		int en=sc.nextInt();
		for(int i=sn;i<=en;i++) {
			BigInteger b=BigInteger.valueOf(i);
			if(b.isProbablePrime(23)) {
				System.out.print(" "+i);
			}
		}
		

	}

}
