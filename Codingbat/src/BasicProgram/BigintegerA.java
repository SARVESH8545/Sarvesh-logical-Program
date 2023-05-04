package BasicProgram;

import java.math.BigInteger;

public class BigintegerA {

	public static void main(String[] args) {
	BigInteger a= BigInteger.valueOf(5);
	BigInteger b=new BigInteger("8");
	System.out.println(a.multiply(b)); //40 ==>5*8
	System.out.println(a.add(b));      //13 ==>5+8
	System.out.println(a.subtract(b)); //-3 ==>5-8
	System.out.println(a.divide(b));   //0 ==>5/8
	System.out.println(a.mod(b));      //5 ==>5%8
	System.out.println(a.pow(2));      //25 ==>5^2
	System.out.println(a.nextProbablePrime());   //7 ==>7 is next prime number after 5.
	
	
	}

}
