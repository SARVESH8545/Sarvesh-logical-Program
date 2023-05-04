package com.java_methodss;

public class Methods_Demo1 {
	int stringLength(String name) {
		//System.out.println(name.length());
		return name.length();
	}

	String stringConcat(String fname,String lname) {
		return fname+lname;
	}

	String elgilibleVote(int age) {
		if (age>=10) {
			return "You are eligible for vote";

		}else {
			return "Not eligible";
		}


	}
	void check(int age) {
		if (age>=18) {
			System.out.println("You are eligible for vote");

		}

	}

	void upperCaseString(String s1) {
		System.out.println(s1.toUpperCase());

	}

	public static void main(String[] args) {
		Methods_Demo1 m1=new Methods_Demo1();
		m1.stringLength("Sarvesh");
		m1.stringConcat("Sarvesh", "Pandey");
		m1.elgilibleVote(19);
		m1.check(20);
		m1.upperCaseString("Sarvesh");
	}

}
