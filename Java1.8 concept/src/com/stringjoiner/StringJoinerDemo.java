package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("-");
		sj.add("Sarvesh");
		sj.add("Pandey");
		System.out.println(sj);//Sarvesh-Pandey
		System.out.println("---------------------");
		StringJoiner sj1=new StringJoiner("-","[","]");
		sj1.add("Sarvesh");
		sj1.add("Kumar");
		sj1.add("Pandey");
		System.out.println(sj1);//[Sarvesh-Kumar-Pandey]
	}

}
