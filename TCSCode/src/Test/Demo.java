package Test;

public class Demo {

	//public static void main(String[] args) {
		// reverse a string
		//		String s="Sarvesh";
		//		String rev="";
		//		for (int i = s.length()-1; i>=0; i--) {
		//			rev=rev+s.charAt(i);
		//			}
		//		System.out.println(rev);
		//

		// Reverse a number
		//		int n=1234;
		//		String s=""+n;
		//		String rev="";
		//		for (int i = s.length()-1; i>=0; i--) {
		//		rev=rev+s.charAt(i);
		//		}
		//		System.out.println(rev);

		//		int n=1234;
		//		int rem,rev=0;
		//		while(n!=0) {
		//			rem=n%10;
		//			rev=rev*10+rem;
		//			n=n/10;
		//		}
		//		System.out.println(rev);

		//Palindrome number
//		int n=111;
//		int rem,rev=0;
//		int temp;
//		temp=n;
//		while(n!=0) {
//			rem=n%10;
//			rev=rev*10+rem;
//			n=n/10;
//		}
//		if(rev==temp) {
//			System.out.println("Palindrome number");
//		}else {
//			System.out.println("Not a palindrome Number");
//		}

//		// prime Number
//		int n=17;
//		int c=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				c++;
//			}
//		}
//		if(c==2) {
//			System.out.println("Prime Number");
//		}
//		else {
//			System.out.println("Not a prime Number");
//		}
		
		//Leap year
		
		
	//}
	  static boolean checkYear(int year)
	    {
	        // If a year is multiple of 400, 
	        // then it is a leap year
	        if (year % 400 == 0)
	            return true;
	     
	        // Else If a year is muliplt of 100,
	        // then it is not a leap year
	        if (year % 100 == 0)
	            return false;
	     
	        // Else If a year is muliplt of 4,
	        // then it is a leap year
	        if (year % 4 == 0)
	            return true;
	        return false;
	    }
	         
	    // Driver method
	    public static void main(String[] args) 
	    {
	        int year = 2000;
	        System.out.println( checkYear(2000)? "Leap Year" :
	                           "Not a Leap Year" );
	    }

}
