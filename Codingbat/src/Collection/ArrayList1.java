package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(100);
		al.add(10.20);
		al.add('A');
		al.add("Sarvesh");
		al.add(true);
		al.add(null);
		System.out.println(al);

		//size

		System.out.println("size"+al.size());

		//remove
		System.out.println("After removeing Element:"+al.remove(0));

		//insert a new Element
		al.add(1,"java");
		System.out.println("After adding a new Element:"+al);

		//retrive a specific element
		System.out.println(al.get(3));

		//replace element

		al.set(1, "c#");
		System.out.println("After replace element"+al);

		//search- contains
		System.out.println(al.contains("c#"));
		System.out.println(al.contains("c++"));

		// isEmpty
		System.out.println(al.isEmpty());

		// for loop
		System.out.println("Reading element using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}

		//for each loop

		System.out.println("By For each loop");
		for(Object o:al) {
			System.out.println(o);

		}

		// by iterator 
		System.out.println("BY Iterator");
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
