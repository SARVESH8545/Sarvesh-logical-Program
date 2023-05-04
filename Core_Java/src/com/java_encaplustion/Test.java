package com.java_encaplustion;

public class Test {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setId(101);
		acc.setName("SBI");
		int id = acc.getId();
		System.out.print(id+"---");
		String name = acc.getName();
	   System.out.println(name);	
	}

}
