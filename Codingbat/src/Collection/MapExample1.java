package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(101,"abc");
		map.put(102,"def");
		map.put(103,"qwe");
		//System.out.println(map);
		for (Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}

	}

}
