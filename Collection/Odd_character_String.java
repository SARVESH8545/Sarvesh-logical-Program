import java.util.*;
class Odd_character_String 
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
		List<Character> kl=new ArrayList(m.keySet());
		List<Character> vl=new ArrayList(m.values());
		for(int i=0;i<m.size();i++)
		{
		if(vl.get(i)%2==1)
			{
		System.out.println(kl.get(i));
		}
		}
	
	}
}
