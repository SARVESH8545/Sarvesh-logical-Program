import java.util.*;
class  Map_Demo
{
	public static void main(String[] args) 
	{
		LinkedHashMap lhm=new LinkedHashMap();
		// HashMap lhm=new HashMap();   // insertion order is not presernved 
		//TreeMap lhm=new TreeMap();
		lhm.put("Hii",5);
		lhm.put("10",'A');
		lhm.put("20.5",true);
		lhm.put("15",5);
		lhm.put("Hii",555);
		System.out.println(lhm);
		System.out.println("Size is:"+lhm.size());//4
        System.out.println(lhm.containsKey("Hii"));//true
		System.out.println(lhm.containsValue(100));//false
		System.out.println(lhm.keySet());
			System.out.println(lhm.get(100));
			System.out.println(lhm.values());
	}
}