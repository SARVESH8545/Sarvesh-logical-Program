package com.stream;

import java.util.ArrayList;
import java.util.List;

class Product{
	int id;
	String productname;
	int price;

	public Product(int id, String productname, int price) {
		super();
		this.id = id;
		this.productname = productname;
		this.price = price;
	}


}

public class DemoPrice {

	public static void main(String[] args) {
		List<Product>list=new ArrayList<>();
		list.add(new Product(101,"HP Laptop",20000));
		list.add(new Product(102,"Sony Laptop",23000));
		list.add(new Product(103,"Dell Laptop",25000));
		list.add(new Product(104,"Apple Laptop",50000));
		list.add(new Product(105,"lenove Laptop",30000));

		list.stream().filter(pr->pr.price>25000).forEach(p->System.out.println(p.price));


	}

}
