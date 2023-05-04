package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator<String> iterable=set.iterator();
		while (iterable.hasNext()) {
			System.out.println(iterable.next());
			
		}


	}

}
