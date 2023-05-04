package com.string;

public class ImmutableString {

	public static void main(String[] args) {
		//immutable 
		String string="Sarvesh";
		string.concat("Pandey");
		System.out.println("Immutable String : "+string);
		
		//mutable  Buffer
		StringBuffer sb=new StringBuffer("Sarvesh");
		StringBuffer sb1=new StringBuffer(" Pandey");
		sb.append(sb1);
		System.out.println("Mutable Buffer: "+sb);
		
		//mutable  Builder
				StringBuilder sb2=new StringBuilder("Sarvesh");
				StringBuilder sb3=new StringBuilder(" Pandey");
				sb2.append(sb3);
				System.out.println("Mutable Builder: "+sb2);
						
	}

}
