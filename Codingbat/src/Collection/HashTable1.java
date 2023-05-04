package Collection;

import java.util.Hashtable;


public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> h=new Hashtable<>();
		h.put(101, "Sarvesh");
		h.put(102,"Pandey");
		h.put(103, "ECE");
		h.put(104, "rahul");
		h.put(105,"raja");
	   //h.put(null,null);//if we put null  as  key and value both  then we get NullPointerException 
		System.out.println(h);
		
		System.out.println(h.get(102));
		
		System.out.println(h.containsKey(107));
		System.out.println(h.containsKey(101));
		
		System.out.println(h.containsValue("raja"));
		System.out.println(h.containsValue("rani"));
		
		System.out.println(h.isEmpty());
		
		System.out.println(h.keySet());
		System.out.println(h.values());
		
		for (int  k :h.keySet()) {
			System.out.println(k+" "+h.get(k));
			
		}
	}

}
