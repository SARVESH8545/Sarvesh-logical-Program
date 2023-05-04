package Collection;

import java.util.HashMap;

import Pattern.M;
public class HashMap1 {

	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap();
		hm.put(101,"smith");
		hm.put(102, "john");
		hm.put(103,"monu");
		hm.put(104,"sonu");
		hm.put(105,"Ram");
		System.out.println(hm);

		System.out.println(hm.get(104));

		System.out.println(hm.remove(102));
		System.out.println(hm);

		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("sonu"));
		System.out.println(hm.containsValue("ABC"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println();


	}

}
