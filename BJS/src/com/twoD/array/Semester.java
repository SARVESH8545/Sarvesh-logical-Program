package com.twoD.array;

public class Semester {

	public static void main(String[] args) {
		int x=0,z=0;

		int first[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("First sem");
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first.length; j++) {
				System.out.print(first[i][j]+" ");
			}
			System.out.println();
		}
		int second[][]= {{7,8,9},{4,5,6},{10,2,3}};
		System.out.println("Second  sem");
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second.length; j++) {
				System.out.print(second[i][j]+" ");
			}
			System.out.println();
		}
		int third[][]=new int[second.length][second.length];
		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < second.length; j++) {
				third[i][j]=first[i][j]+second[i][j];
			}

		}
		System.out.println("Addition of both semester");
		for (int i = 0; i < third.length; i++) {
			for (int j = 0; j < third.length; j++) {
				System.out.print(third[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Addition of left diagonal");
		for (int i = 0; i < third.length; i++) {
			for (int j = 0; j < third.length; j++) {
				if (i==j) {
					z=third[0][0]+third[1][1]+third[2][2];
					System.out.println("Z :"+z);
				}
				break;
			}
		}

		System.out.println("Addition of right diagonal");
		for (int i = 0; i < third.length; i++) {
			for (int j = 0; j < third.length; j++) {
				if (j==third.length-1-i) {
					x=third[0][2]+third[1][1]+third[2][0];
					System.out.println("X :"+x);
				}
				break;

				//double a=(Math.pow(x,2))-(Math.pow(z,2));///(Math.sqrt(x-z)))*100);

				/*if (a%2==0) { System.out.println("Even");

			  }else { System.out.println("odd"); }

			}*/

			}
		}

	}
}
