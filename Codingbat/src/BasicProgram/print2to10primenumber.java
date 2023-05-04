package BasicProgram;

import java.math.BigInteger;

public class print2to10primenumber {

	public static void main(String[] args) {
		for(int i=2;i<=10;i++) {
			BigInteger b=BigInteger.valueOf(i);
			if(b.isProbablePrime(23)) {
				System.out.println(i);
			}
		}

	}

}
