package com.java_methodss;

class Student{
	int SId;
	String SName;	
}

public class ObjectASParameter {
	void print(Student s) {
		System.out.println(s.SId+"  "+s.SName);
	}

	public static void main(String[] args) {
		ObjectASParameter obj=new ObjectASParameter();
		Student student=new Student();
		student.SId=101;
		student.SName="Sarvesh";
		obj.print(student);

	}


}
