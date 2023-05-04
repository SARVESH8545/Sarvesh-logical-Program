package String2;

public class Delete_vowel_from_String {

	public static void main(String[] args) {
		String t="";
		String s="This is my class";
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
					c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			
{
				
			}
			else
			{
				t=t+c;
			}
		}
   System.out.println(t); //Ths s my clss

	}

}
