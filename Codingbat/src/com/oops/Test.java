package com.oops;

public class Test {

	public static void main(String[] args) {
		Student st1=new Student();
		st1.studentId=101;
		st1.studentName="RAM";
		st1.studentCity="Delhi";
		st1.show();
		st1.name();
		
		Student st2=new Student();
		st2.studentId=102;
		st2.studentName="SAM";
		st2.studentCity="Lucknow";
		st2.show();
		st2.name();
		
		Student st3=new Student(12,"Mohan","ABC");
		
		
		

	}

}
