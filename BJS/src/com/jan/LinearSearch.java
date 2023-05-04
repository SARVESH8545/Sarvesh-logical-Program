package com.jan;

public class LinearSearch {
	static int search(int hub[],int skey) {
		for (int i = 0; i < hub.length; i++) {
			if (hub[i]==skey) {
				return skey;
			}


		}
		return -1;

	}

	public static void main(String[] args) {
		int bjs[]= {45,50,80,100,200,500};
		int key=200;
		System.out.println(search(bjs, key));



	}

}
