package com.jan;

public class BinarySearch {

	public static void main(String[] args) {
		int bjs[]= {3,9,15,23,45,67,99};
		int low=0;
		int high=bjs.length;
		int mid=(low+high)/2;
		int search=99;
		while(low<=high) {
			if (bjs[mid]==search) {
				System.out.println("Position of search element :"+mid);
				break;
			}
			else if (bjs[mid]<search) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			mid=(low+high)/2;
		}
		if (low>high) {
			System.out.println("Sorry data is not found");

		}

	}
}
