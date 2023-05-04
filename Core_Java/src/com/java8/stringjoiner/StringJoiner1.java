package com.java8.stringjoiner;

import java.util.StringJoiner;

public class StringJoiner1 {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("-");
		sj.add("Sarvesh");
		sj.add("Kumar");
		sj.add("Pandey");
		System.out.println(sj);

		StringJoiner sj2 = new StringJoiner("-", "(", ")");
		sj2.add("ashok");
		sj2.add("it");
		sj2.add("java");
		System.out.println(sj2); // (ashok-it-java)


	}

}
