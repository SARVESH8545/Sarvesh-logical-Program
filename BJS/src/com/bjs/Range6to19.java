package com.bjs;

public class Range6to19 {

	public static void main(String[] args) {
		int sum=0;
		for (int i =6; i<=19; i++) {
			sum=sum+i;
		}
		System.out.println(sum);

		int sumeven=0;
		for (int i=6;i<=19; i=i+2) {

			sumeven=sumeven+i;
		}
		System.out.println(" even sum"+sumeven);

		int oddsum=0;
		for (int i=6;i<=19;i++) {
			if(i%2!=0) {
				oddsum=oddsum+i;
			}
		}
		System.out.print("odd sum "+oddsum);



	}

}
