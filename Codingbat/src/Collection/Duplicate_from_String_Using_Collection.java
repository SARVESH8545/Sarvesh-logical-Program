package Collection;

import java.util.LinkedHashSet;

public class Duplicate_from_String_Using_Collection {

	public static void main(String[] args) {
	String s="bananas";
	LinkedHashSet lhs=new LinkedHashSet();
	for(int i=0;i<s.length();i++) 
	{
		char c=s.charAt(i);
		lhs.add(c);
	}
	String t="";
	for( Object data:lhs)
	{
		t=t+data;
	}	
	System.out.println(t);
	}

}
