package BasicProgram;

import java.math.BigInteger;

// Wap to print nth prime number.
public class Primenumber7 {

	public static void main(String[] args) {
		int c=0;
		int res=0;
		for(int i=2; ;i++) {
			BigInteger b=BigInteger.valueOf(i);
			if(b.isProbablePrime(63)) {
				res=i;
				c++;
			}
			if(c==3) {
				break;
				//System.out.println(i);
			}

		}

		System.out.println(res);
	}

}
//output==5
