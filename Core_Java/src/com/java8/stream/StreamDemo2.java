package com.java8.stream;

import java.util.List;
import java.util.stream.Stream;

class User{
	int id;
	String name;
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class StreamDemo2 {
	public static void main(String[] args) {
		User u1=new User(101,"Sarvesh");
		User u2=new User(102,"Pandey");
		User u3 =new User(103,"Ram");
		User u4 = new User(104,"Shyam");
		Stream<User> stream = Stream.of(u1,u2,u3,u4);
		stream.filter(u->u.id==101).forEach(i->System.out.println(i));
		
	}

}
