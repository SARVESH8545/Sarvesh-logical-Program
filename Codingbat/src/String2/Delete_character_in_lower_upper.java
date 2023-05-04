package String2;

public class Delete_character_in_lower_upper {

	public static void main(String[] args) {
		 String t="";
		 String s="a2b3c6#A";
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(c>='A'&& c<='Z'||c>='a'&& c<='z')
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
