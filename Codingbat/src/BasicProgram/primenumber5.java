package BasicProgram;

import java.math.BigInteger;

public class primenumber5 {

	public static void main(String[] args) {
		int c=0;
		for(int i=1; ;i++) {
			BigInteger b=BigInteger.valueOf(i);
			if(b.isProbablePrime(6534)) {
				System.out.println(i);
				c++;
			}
			if(c==5)
				break;
		}

	}

}
