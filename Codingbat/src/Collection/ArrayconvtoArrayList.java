package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayconvtoArrayList {

	public static void main(String[] args) {
		String s[]= {"Dog","cat","Elephat"};
		
		for (String string : s) {
			System.out.println(string);
			
		}
		ArrayList al=new ArrayList(Arrays.asList(s));
		System.out.println(al);
	}

}
