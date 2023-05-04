package com.arrayassignement;

/*6. Write a Java program, create 1D array 
{10, 15, 20, 60, 90, 20, 15, 20}.
Print the array without duplication. 
 */

public class Question6 {

	public static void main(String[] args) {
		int[] ar = {10,15,20,60,90,20};

		for (int i = 0; i <ar.length; i++) {
			boolean dup = false;
			for (int j = 0; j <ar.length; j++) {
				if (i != j && ar[i] == ar[j]) {
				dup = true;
					break;
				}
			}
			if (!dup) { //!flase=true
				System.out.println(ar[i]);
			}
		}
	}

}
