import java.util.*;
class RemoveDuplicate_String 
{
	public static void main(String[] args) 
	{
		String s="bananas";
		LinkedHashSet lhs=new LinkedHashSet();
		for(int i=0;i<s.length();i++)
			{
			char c=s.charAt(i);
			lhs.add(c);
		}
		String t="";
		for(Object data:lhs)
		{
			t=t+data;
		}
		System.out.println(t);
	}
}
