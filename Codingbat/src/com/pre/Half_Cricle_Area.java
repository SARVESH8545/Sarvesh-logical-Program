package com.pre;

import java.util.Scanner;

public class Half_Cricle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Radic");
		int r=scanner.nextInt();
		Double area=((1/2)*((Math.PI)*(r*r)));
		System.out.println(area);

	}

}
