package Javatpoint_String_program;

public class CountVowelConsonant {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String s="This is a really simple sentence";
		s=s.toLowerCase();
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vCount++;
			}
			else if(c>='a' && c<='z')
			{
				cCount++;
			}
			
		}
		System.out.println("Number of vowels:"+vCount);
		System.out.println("Number of consonant:"+cCount);

	}

}
