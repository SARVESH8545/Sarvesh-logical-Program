package com.string;

// Wap convert first letter of each word from lower case to upperCase
public class FirstCapsLetter {

	public static void main(String[] args) {
		String string="sarvesh kumar pandey";
		char c[]=string.toCharArray();
		int size=c.length;
		c[0]=(char)(c[0]-32);//s-32==>S
		
	int i=0;
	while(i!=size) {
		if (c[i]==' ') {
			c[i+1]=(char)(c[i+1]-32);
			
		}
		++i;
	}
		System.out.println("Original String :"+string);//sarvesh kumar pandey
		//System.out.println(c); // Sarvesh Kumar Pandey
		System.out.println("New words :"+(new String(c))); //Sarvesh Kumar Pandey

	}

}
