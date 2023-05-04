package Cordics;

import java.util.Scanner;
import java.util.Vector;

public class Test {

	static boolean isSumOfPower(int n) { 
		boolean []isSum = new boolean[n + 1]; 
		Vector<Integer> perfectPowers = new Vector<Integer>(); 
		perfectPowers.add(1); 
		for(int i = 0; i < (n + 1); i++){ 
			isSum[i] = false; 
		} 
		for(int i = 2; i < (n + 1); i++){ 
			if (isSum[i] == true){ 
				perfectPowers.add(i); 
				continue; 
			} 
			for(int j = i * i;j > 0 && j < (n + 1);j *= i){ 
				isSum[j] = true; 
			} 
		} 

		for(int i = 0; i < perfectPowers.size();i++){ 
			isSum[perfectPowers.get(i)] = false; 
		} 
		for(int i = 0;i < perfectPowers.size();i++){ 
			for(int j = i;j < perfectPowers.size();j++){ 
				int sum = perfectPowers.get(i) +  
						perfectPowers.get(j); 
				if (sum < (n + 1)) 
					isSum[sum] = true; 
			} 
		} 
		return isSum[n]; 
	} 
	//main method
	public static void main(String[] args) 
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n =sc.nextInt(); 

		if (isSumOfPower(n)) 
		{ 
			System.out.println("PASSED"); 
		} 
		else 
		{ 
			System.out.print("FAILED"); 
		} 
	}  
} 



