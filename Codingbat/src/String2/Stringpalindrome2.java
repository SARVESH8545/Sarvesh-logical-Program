package String2;

public class Stringpalindrome2 {

	public static void main(String[] args) {
	/*String s="abcba";
	String t="";
	for(int i=0;i<s.length();i++) {
		t=s.charAt(i)+t;
	}
	if(s.equals(t)) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Polindrome");
	}*/
		
		
	String s="abcba";
	int slap=0;
	for(int sl=0,ei=s.length()-1;sl<ei;sl++,ei--) {
		if(s.charAt(sl)==s.charAt(ei)) {
			
		}
		
		else {
			slap++;
			break;
		}
	}
	if(slap==0) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not a Polindrome");
	}
	}

}
