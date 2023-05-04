package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Conversion_of_set_to_list {

	public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(5);
	t.add(2);
	t.add(3);
	ArrayList al=new ArrayList(t);
	Collections.reverse(al);
	System.out.println(al);
	
	}

}
