package com.bjs;
public class ForLoop5to15 {
public static void main(String[] args) {
		int r1=0;
		for (int i = 5; i<=15; i++) {
			if(i==9) {
				break;}
			// major axis
			r1+=i;	}
		System.out.println("major axis :"+r1);
		int r2=0;
		for (int i = 5; i<=15; i++) {
			if(i==11) {
				continue; }
			//minor axis
			r2+=i;}
		System.out.println("minor axis :"+r2);
		//area of ellpise=pi*r1*r2
		int z=(int)(Math.PI)*r1*r2;
		System.out.println("Area of ellpise :"+z);
		int count=0;
		for (int i=1; i<=z; i++) {
			if (z%i==0) {
				count++;}}
		if (count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a Prime Number");
		}}}
