package com.pre;

import java.util.Arrays;

public class Array_Concept {

	public static void main(String[] args) {

		String s="abcdaacdddfee";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String s1=new String(ch);
		for (int i = 0; i <s1.length();) {
			char c=s1.charAt(i);
			int occ=s1.lastIndexOf(c)-s1.indexOf(c)+1;
			System.out.println(""+c+" "+occ);
			i=s1.lastIndexOf(c)+1;

		}
		//System.out.println(s1);




		//		String t="";
		//		while (s.length()>0) {
		//			char ch=s.charAt(0);
		//			t=t+ch;
		//			s=s.replace(""+ch,"");
		//			
		//		}
		//		System.out.println(t);
		//		

		//		for (int i = 0; i <s.length(); i++) {
		//			char ch=s.charAt(i);
		//			if (s.indexOf(ch)==s.lastIndexOf(ch)) {
		//				System.out.print(ch);
		//				
		//			}
		//			
		//		}
		//		String s="aPpLe";//input output=Apple
		//		String s1=s.substring(1).toLowerCase();
		//		//System.out.println(s1);
		//		String s2=""+s.charAt(0);
		//		System.out.println(s2.toUpperCase()+s1);









		//		String string="bananas";
		//		System.out.println(string.replace("a","x"));
		//		

		//		String s="abfsjdf";
		//		char ch[]=s.toCharArray();
		//		Arrays.sort(ch);
		//		String s1=new String(ch);
		//		System.out.println(s1);
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("Enter any String");
		//		String s=sc.nextLine();
		//		StringBuilder sb=new StringBuilder(s);
		//		sb.reverse();
		//		if (s.equals(""+sb)) {
		//			System.out.println("Ploydrome String");
		//			
		//		}else {
		//			System.out.println("Not");
		//		}
		//System.out.println(sb);
		//		for (int i = s.length()-1; i>=0; i--) {
		//			System.out.print(s.charAt(i));
		//			
		//		}
		//int lastindex=s.length()-1;
		//char c=s.charAt(lastindex);
		//System.out.println(c);
		//char ch=s.charAt(2);
		//System.out.println(ch);
		//int ar[]= {1,2,3,4};
		//int br[]= {1,2,3,4,5};
		//System.out.println(Arrays.equals(ar, br));

		//int ar[]= {1,0,3,5,4,2,6};
		//Arrays.fill(ar,2,5,-8);
		//int br[]=Arrays.copyOfRange(ar, 1,3);
		//Arrays.sort(ar,2,6);
		//Arrays.sort(ar);
		//String string = Arrays.toString(ar);
		//System.out.println(string);

	}

}
