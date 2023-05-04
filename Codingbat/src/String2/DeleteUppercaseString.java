package String2;

public class DeleteUppercaseString {

	public static void main(String[] args) {
	String t="";
	String s="a2b3c6#A";
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
				if(Character.isUpperCase(c))
				{
					
				}
				else
				{
					t=t+c;
				}
	}
	System.out.println(t);
	
	}

}
