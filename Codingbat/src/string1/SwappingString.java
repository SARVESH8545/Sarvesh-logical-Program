package string1;

public class SwappingString {

	public static void main(String[] args) {
		String s1="Sarvesh";
		String s2="Pandey";
//		String temp="";
//		temp=s1;
//		s1=s2;
//		s2=temp;
//		System.out.println(s1);
//		System.out.println(s2);
		s1=s1.concat(s2);
		System.out.println("After concat"+s1);
		s2=s1.substring(0,(s1.length()-s2.length()));
		System.out.println("After substring s2"+s2);
		s1=s1.substring(s2.length());
		System.out.println("After concat s1"+s1);
		
		//System.out.println(s1);
	//	System.out.println(s2);
		
	}

}
