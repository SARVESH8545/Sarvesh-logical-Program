package com.java8.lambdaExpression;

@FunctionalInterface
interface Name{
	public void name(String firstName,String lastName);
} 
//class Kumar implements Name{
//
//	@Override
//	public void name() {
//		System.out.println("Sarvesh");
//		
//	}
//	
//}

public class Test3 {

	public static void main(String[] args) {
		Name cab=(firstName,lastName)->System.out.println("FirstName is "+firstName+ " LastName is "+lastName);
//		Name cab= new Kumar();
		cab.name("Sarvesh","Pandey");
		

	}

}
