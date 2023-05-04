package com.arrayassignement;
/*9. Write a Java program, check if any array have 5 and 10 as the values.
If the values are available print False. 
If the values are not available print True. */

public class Question9 {

	public static void main(String[] args) {
		
		int ar[]= {1,3,4,8};
		
		for (int i = 0; i <ar.length; i++) {
			if (ar[i]==5 && ar[i]==10) {
			System.out.println("F");
			continue;
             }else {
				System.out.println("T");
				break;
			}
		}

	}

}