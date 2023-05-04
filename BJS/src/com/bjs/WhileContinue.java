package com.bjs;

public class WhileContinue {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			if (i==3) {
				i++;  //4
				continue;
				
			}
			System.out.println(i);
			i++;
		}

	}

}
/*
 * wap take range from 1 to 5 and use do while 
 * case print data till print data with out 2.
 * 
 * Design a clg marks card where we have subject var
 * take number of sub by the help of user 
 * also take sub marks from user and find out total marks.
 * 
 * find out %of marks 
 * 
 * acc to percentage print there grade.
 * 
 * 
 */