package com.pre;

public class LogicalCodePrepratio {

	public static void main(String[] args) {
		int n=7,c=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				c++;	
			}
		}
		if (c==2) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime number");
		}

	}
}


