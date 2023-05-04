package BasicProgram;

import java.util.Scanner;

public class FabbonicSeries {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		int n1=0;
		int n2=1;
		int count =scanner.nextInt();
		System.out.print(n1+" "+n2);
		for (int i = 0; i < count; i++) {
		int n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
	}

}
