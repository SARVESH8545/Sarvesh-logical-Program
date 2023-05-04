package com.java8.lambdaExpression;



@FunctionalInterface
interface CabA{
	public String bookcab(String source,String destination);
}

//class Ola implements CabA{
//
//	@Override
//	public void bookcab(String source, String destination) {
//		System.out.println("Ola cab is running "+source+" To "+destination);
//	}
//	
//}
public class Test1 {

	public static void main(String[] args) {
		CabA cab=(source,destination)->{ System.out.println("Ola cab is running "+ source+" To "+destination);
		return ("Prise :rs 5000");
		};
		System.out.println(cab.bookcab("hyd","ban"));

	}

}
