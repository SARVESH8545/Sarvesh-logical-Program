package com.projectday2;

public class Stars5 {

	public static void main(String[] args) {
		double a1,a2,a3,a4,a5;
		a1=Math.random();
		a2=Math.random();
		a3=Math.random();
		a4=Math.random();
		a5=Math.random();
		double maxvalue=Math.max(Math.max(Math.max(Math.max(a1,a2),a3),a4),a5);	
		double minvalue=Math.min(Math.min(Math.min(Math.min(Math.min(a1,a2),a2),a3),a4),a5);	
		double avg=(a1+a2+a3+a4+a5)/5;
		System.out.println(maxvalue);
		System.out.println(minvalue);
		System.out.println(avg);
	}

}
