package com.bjs;
public class SwitchChar {

	public static void main(String[] args) {
		
		char grade='c';
		switch(grade) {
		case 'a':
			System.out.println("Excellent1");
			break;
		case 'b':
			System.out.println("very good");
			break;
		case 'c':
			System.out.println("good");
			break;
		case 'd':
			System.out.println("fail");
			break;
			default :
				System.out.println("Grade not valid");
		}

	}

}
