package com.projectday2;
/* Write a program ​FlipCoin.java to simulate a coin flip and print out "Heads" or 
 *"Tails" accordingly and finally print the percentage of Head vs Tail. */
public class Fillcoin {

	public static void main(String[] args) {
		if(Math.random()>0.5) {
			System.out.println("Heads");
		}else {
			System.out.println("tail");
		}	
	}

}
