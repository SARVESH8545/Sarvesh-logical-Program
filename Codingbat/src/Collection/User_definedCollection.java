package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int id;
	String name;
	String city;
	public Student(int i,String n,String c) {
		this.id=i;
		this.name=n;
		this.city=c;
		// TODO Auto-generated constructor stub
	}
}


public class User_definedCollection {

	public static void main(String[] args) {
		Student s1=new Student(101,"ABC","xyz");
		Student s2=new Student(102,"def","qwe");
		Student s3=new Student(103,"ghj","a12");
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		 Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.id+" "+st.name+" "+st.city);  
			
		}

	}

}
