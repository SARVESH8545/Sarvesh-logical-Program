import java.util.*;
class  Occurance_Loop_LinkedHashSet
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Character,Integer> m=new LinkedHashMap();
		String s="bananas";
		for(int i=0;i<s.length();i++)
			{
		if(m.containsKey(s.charAt(i)))
				{
		int old=m.get(s.charAt(i));
		int neww=old+1;
       m.put(s.charAt(i),neww);
		}
		else
				{
		    m.put(s.charAt(i),1);
		}
		}
		System.out.println(m);
	}
}
