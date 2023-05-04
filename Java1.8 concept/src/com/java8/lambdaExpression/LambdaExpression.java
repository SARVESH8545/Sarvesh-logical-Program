package com.java8.lambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

/*interface Addable{ 
int sum(int a, int b);
  
} */
public class LambdaExpression{  
    public static void main(String[] args) {
        Function<Integer, Integer> f1=a->a+a;
        System.out.println(f1.apply(10));
    	
		/*
		 * Predicate<Integer> predicate=i->i>10; System.out.println(predicate.test(20));
		 */
		/*
		 * Addable addable=(a,b)->(a+b); System.out.println(addable.sum(10,20));
		 */
     
    }  
}  