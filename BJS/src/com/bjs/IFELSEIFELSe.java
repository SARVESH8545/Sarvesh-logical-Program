package com.bjs;

import java.util.Scanner;

public class IFELSEIFELSe {

	public static void main(String[] args) {
		System.out.println("Enter Testmarks");
		Scanner scanner=new Scanner(System.in);
		int testmarks=scanner.nextInt();
		if(testmarks<40) {
			System.out.println("Fail");
		}else if(testmarks>=40 && testmarks<50){
			System.out.println("D Grade");
			}else if(testmarks>50 && testmarks<60) {
				
				System.out.println("C Grade");
				}else if (testmarks>60&&testmarks<70) {
					System.out.println("B grade");
				}
		else if (testmarks>70&&testmarks<80) {
			System.out.println("A grade");
		}
		else {
			System.out.println("S Grade");
		}
	}

}
