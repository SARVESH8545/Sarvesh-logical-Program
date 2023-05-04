package com.bjs;

import java.math.BigInteger;

public class Factlarge {
	public static BigInteger fact(int n) {
		BigInteger fBigInteger=new BigInteger("1");
		for (int i = 2; i <=n; i++) {
			fBigInteger=fBigInteger.multiply(BigInteger.valueOf(i));
			
		}
		return fBigInteger;
	}

	public static void main(String[] args) {
		int n=175;
		System.out.println(fact(n));
	}

}
