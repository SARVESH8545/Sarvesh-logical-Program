package com.string;

// How to verify is String contains only Integer.
public class IntegerVerification {

	public static void main(String[] args) {
		String string = "12345";
		char c[] = string.toCharArray();
		int size = c.length;
//		int i=0;
//		while(i!=0) {
//			if (c[i]>='0' && c[i]<='9') {
//				++i;
//			}else {
//				System.out.println("Not an integer String");
//				System.exit(0);
//			}
//			
//		}
//		System.out.println("Integer String");

		
		  for (int i = 0; i < c.length; i++) {
			  if (c[i]>='0' && c[i]<='9') {
		  System.out.println("Integer String");
		  System.exit(0); 
		  } else {
		  System.out.println("NOt Integer String"); }
		  
		  }
		 
	}

}
