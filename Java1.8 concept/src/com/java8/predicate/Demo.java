 package com.java8.predicate;

import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
//		Predicate<Integer> p=i->(i>20);
//		System.out.println(p.test(30));//true
//		System.out.println(p.test(5));//false
//
//		Predicate<String> predicate=s->(s.length()>4);
//		System.out.println(predicate.test("Welcome"));//true
//		System.out.println(predicate.test("run"));//false
//		Ex:3 print array element whose size is >4 from array
//		String name[]= {"smith","scott","david","john","Mary"};
//		for (String string : name) {
//			if (predicate.test(string)) {
//				System.out.println(string);
//			}
//		}
	 int a[]= {5,15,25,30,35,40,45,50,60,65,75,80};
	 Predicate<Integer> p1=i->(i%2==0);
	 Predicate<Integer> p2=i->(i>50);
//	 for (int n : a) {
//		 //if (p1.test(n)&& p2.test(n)) 
//		 if (p1.and (p2).test(n)) 
//		 {
//			 System.out.println(n);
//			
//		}
//		
//	}
//	 for (int n : a) {
//		 //if (p1.test(n)|| p2.test(n)) 
//		 if (p1.or (p2).test(n)) 
//		 {
//			 System.out.println(n);
//			
//		}
//		
	//}
	 
//	 for (int n : a) {
//		 //if (p1.test(n)!= p2.test(n)) 
//		 if (p1.negate().test(n)) 
//		 {
//			 System.out.println(n);
//			
//		}
//		
//	}
	 for (int n : a) {
		 //if (p1.test(n) != p2.test(n)) 
		 if ((p2).negate().test(n)) 
		 {
			 System.out.println(n);
			
		}
		
	}
		
	}

}
