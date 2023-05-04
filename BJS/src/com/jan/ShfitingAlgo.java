package com.jan;

public class ShfitingAlgo {
	static void shift(int ar[],int size) {
		int count=0;
		for (int i = 0; i <size; i++) {
			if (ar[i]!=0) {
				ar[count++]=ar[i];
			}

		}
		while(count<size)
			ar[count++]=0;

	}

	public static void main(String[] args) {
		int mobno[]= {3,6,0,5,0,9,6};
		int n=mobno.length;
		shift(mobno,n);
		
		for (int i = 0; i < mobno.length; i++) {
			System.out.print(mobno[i]+" ");
		}


	}

}
