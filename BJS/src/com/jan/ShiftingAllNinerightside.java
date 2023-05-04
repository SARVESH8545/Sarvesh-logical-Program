package com.jan;

public class ShiftingAllNinerightside {
	
	static void shift(int ar[],int size) {
		int count=0;
		for (int i = 0; i <size; i++) {
			if (ar[i]!=9) {
				ar[count++]=ar[i];
				
			}
			
		}
		while(count<size)
			ar[count++]=9;
	}

	public static void main(String[] args) {
		int mob[]= {0, 9, 0, 9, 0, 9};//{9,1,9,1,4,0,1,9,4,7,1,4};
		int n=mob.length;
		shift(mob, n);
		int sum=0;
		for (int i = 0; i < mob.length; i++) {
			if (mob[i]==9) {
				sum=sum+mob[i];
				}
		System.out.print(mob[i]+" ");	
		}
		System.out.println();
		System.out.println(sum);
		

	}

}
