package com.bjs;

public class WhileloopProgram {

	public static void main(String[] args) {
		int n=24;
		int sum=0;
		while(n>=6) {
			sum+=n;
			System.out.print(n+" ");
			n--;
		}
		System.out.println();
		System.out.println("sum :"+sum);

		int z=(int)sum/4;
		System.out.println("Z :"+z);

		int ar= (int)(Math.PI)*z*z;
		System.out.println("Area :"+ar);

		int temp=ar;
		int rem,rev=0;
      while(temp>0) {
    	  rem=temp%10;
    	  rev=rev*10+rem;
    	  temp=temp/10;
      }
      if(rev==ar) {
    	  System.out.println("Palindrome");
      }else {
		System.out.println("Not palindrome");
	}








	}

}
