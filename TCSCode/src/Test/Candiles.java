package Test;

import java.util.Scanner;

public class Candiles {

	public static void main(String[] args) {
		int n=10,k=5;
		int  num;
		System.out.println("Enter A number: ");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		if (num>=1 && num<=5) {
			System.out.println("Number of candies sold :"+num);
			System.out.println("Number of candies left :"+(n-num));

		}else {
			System.out.println("Invalid input");
			System.out.println("Number of candies left"+n);
		}
	}

}
