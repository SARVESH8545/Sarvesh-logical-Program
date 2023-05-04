package BasicProgram;

import java.util.Scanner;

public class SumoOfFirstNnumber {

	public static void main(String[] args) {
	/*int sum=0;
	int n=50;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
	*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any postive Number");
		int n=sc.nextInt();
		double sum=n*(n+1)/2;
		System.out.println(sum);
	}

}
