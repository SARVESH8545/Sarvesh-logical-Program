package com.java_methodss;

class Product{
	int pId;
	String pName;
	double pPrice;

}
public class Driver {

	void print(Product p) {
		System.out.println(p.pId+"  "+p.pName+"  "+p.pPrice);

	}

	public static void main(String[] args) {
		Driver driver=new Driver();
		Product product=new Product();
		product.pId=100;
		product.pName="Laptop";
		product.pPrice=2000.50;
		driver.print(product);

	}

}
