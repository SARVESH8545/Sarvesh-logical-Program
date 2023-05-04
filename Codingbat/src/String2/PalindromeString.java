package String2;

public class PalindromeString {

	public static void main(String[] args) {
	String s="malayalam";

	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	//System.out.println(sb);
	//System.out.println(s);
	if(s.equals(""+sb)) {
		System.out.println("Palindrome String");
	}
	else {
	System.out.println("Not Polindrome String");
	}
	}


	}
	
	


