package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("A");
		
		al.add("C");
		
		al.add("B");
		
		al.add("X");
		
		al.add("Z");
		
		al.add("Y");
		
		ArrayList al_new=new ArrayList<>();
		al_new.addAll(al);
		System.out.println(al_new);
		
	// sort
		Collections.sort(al_new);
		System.out.println(al_new);
		
		//reverse order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("reverse order"+al);
		
		// shuffling collection shuffle
		Collections.shuffle(al);
		System.out.println("After suffle"+al);
		
		
		
	}

}
