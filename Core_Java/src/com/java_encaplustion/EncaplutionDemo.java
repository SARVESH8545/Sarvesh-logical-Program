package com.java_encaplustion;

public class EncaplutionDemo {
	private long acc;
	private String name;
	

	public long getAcc() {
		return acc;
	}


	public void setAcc(long acc) {
		this.acc = acc;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		EncaplutionDemo ed=new EncaplutionDemo();
		ed.setAcc(123456789);
		ed.setName("SBI Bank");
		long account=ed.getAcc();
		System.out.println(account);
		String name=ed.getName();
		System.out.println(name);

	}

}
