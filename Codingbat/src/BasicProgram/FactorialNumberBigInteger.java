package BasicProgram;

import java.math.BigInteger;

public class FactorialNumberBigInteger {

	public static void main(String[] args) {
		BigInteger fact=BigInteger.valueOf(1);
		int n=500;
		for(int i=1;i<=n;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);

	}

}
