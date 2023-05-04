package com.stream.part6;

import java.util.Arrays;
import java.util.List;

class Student{
	String name;
	int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getScore() {
		// TODO Auto-generated method stub
		return score;
	}

}

public class ParallelStream {

	public static void main(String[] args) {
		List<Student> list=Arrays.asList( new Student("Smith",85),
				new Student("Ram",65),
				new Student("Sachin",90),
				new Student("Shyam",85),
				new Student("Rahim",65),
				new Student("Pandey",95),
				new Student("Radha",85));
		//normal stream
		list.stream().filter(s->s.getScore()>=80).limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getName()));
		// throw parallel stream
		list.parallelStream().filter(s->s.getScore()>=80).limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getName()));
		// parallel after stream
		list.stream().parallel().filter(s->s.getScore()>=80).limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getName()));

	}

}
