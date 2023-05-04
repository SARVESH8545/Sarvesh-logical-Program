package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestCollection1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Ajay");
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		System.out.println(al);
		/*
		 * for (String string : al) { System.out.println(string);
		 * 
		 * }
		 */
		Collections.sort(al);
		System.out.println("returing element"+al.get(1));
		al.set(1,"RAM");
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(12);
		al1.add(25);
		al1.add(1);
		al1.add(10);
		Collections.sort(al1);
		for (Integer integer : al1) {
			System.out.println(integer);
		}
	}

}
