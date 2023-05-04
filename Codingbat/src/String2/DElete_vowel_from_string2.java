package String2;

public class DElete_vowel_from_string2 {

	public static void main(String[] args) {
	
		/*String s="India is Great";
	s=s.replaceAll("[aeiouAEIOU]","");
	System.out.println(s);
	*/
	String s="abcABecabc123!@#";
	//s=s.replaceAll("[abcde]", "");
	//s=s.replaceAll("[a-zA-Z0-9]","");
	s=s.replaceAll("[^a-z]","");
	System.out.println(s);
	}
}
