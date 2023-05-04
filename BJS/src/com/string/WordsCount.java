package com.string;
// wap count number of words in given sentences
public class WordsCount {

	public static void main(String[] args) {
		String string="Java is a programming Langauge";
		String c[]=string.split(" ");// Java
		                             //is
		                             //a
		                            //programming 
		                             //Langauge
		System.out.println(c.length);
}

}
