package bjs.array;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayReverseOrder {

	public static void main(String[] args) {
		Integer arr[]= {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Array elements in descending order: " +Arrays.toString(arr)); 


		String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};   
		// sorts array[] in descending order   
		Arrays.sort(strarray, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(strarray));   
	}

}
