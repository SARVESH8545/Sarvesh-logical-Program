package String2;

public class ReverseString {

	public static void main(String[] args) {
	/*String s="abcd";
	for(int i=s.length()-1;i>=0;i--) {
		System.out.print(s.charAt(i));}*/
		
		
	/*String s="abcd";
	String t="";
	for(int i=s.length()-1;i>=0;i--) 
	{
		t=t+(s.charAt(i));
	}
		System.out.println(t);*/
	
		
	
		/*String s="abcd  ghij";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);*/
		
		String s="abcd";
		String t="";
		for(int i=0;i<s.length();i++) {
			t=s.charAt(i)+t;
		}
	System.out.println(t);
	
	}
}
