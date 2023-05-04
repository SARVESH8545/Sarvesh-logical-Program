package com.bjs;

public class CharacterClass {

	public static void main(String[] args) {
		System.out.println(Character.isLetter('0'));
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('a'));
		System.out.println(Character.isWhitespace('a'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toUpperCase('A'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.isLowerCase(98));
		System.out.println(Character.isLowerCase(67));
		
	}

}
