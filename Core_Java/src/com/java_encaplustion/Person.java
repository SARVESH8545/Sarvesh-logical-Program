package com.java_encaplustion;

public class Person {

	private int id;
	private String name;
	private String gender;
	private String city;
	private String country;

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public static void main(String[] args) {
		Person p=new Person();
		p.setId(101);
		p.setName("Sarvesh");
		p.setGender("Male");
		p.setCity("Goshainganj, Ayodhya");
		p.setCountry("India");
		int id=p.getId();
		System.out.println(id);
		String name=p.getName();
		System.out.println(name);
		String gender=p.getGender();
		System.out.println(gender);
		String city=p.getCity();
		System.out.println(city);
		String con=p.getCountry();
		System.out.println(con);
	}

}
