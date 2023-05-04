package com.arrayassignement;

/*3. Write a Java program, create 1D array
I/P {0, 9, 0, 9, 0, 9, 0}. 
Shift all zeros towards left and 
nines towards right, that is, 
O/P {0, 0, 0, 0, 9, 9, 9}.*/
public class Question3 {

	public static void main(String[] args) {
		int ar[]= {0,9,0,9,0,9,0,9,};
		
		int data=0;//1
		for (int i = 0; i < ar.length; i++) { // 0 <7 
			if (ar[i]!=9) { // 0!=9 true 
				ar[data++]=ar[i]; //0000 9999
				}
		}
		while(data<ar.length) //0<8
			ar[data++]=9; //ar[1]=9
		
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		}



}
