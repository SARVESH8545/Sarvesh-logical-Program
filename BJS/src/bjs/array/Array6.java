package bjs.array;

public class Array6 {

	public static void main(String[] args) {
	int a[]= {198,201,101,404,309};
	for (int i = 0; i < a.length; i++) {
		  }
	 System.out.println(a[2]);
	 //  System.out.println(a[3]);
	 int temp=a[2],rev=0,rem;
	 while(temp>0) {
	  rem=temp%10;
	  rev=rev*10+rem;
	  temp=temp/10;
	}
	if (rev==a[2]) {
		System.out.println("Palindrome Number");
	}
	else {
		System.out.println("Not a Palindrome Number");
	}
	}

}
