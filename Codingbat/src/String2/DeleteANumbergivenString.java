package String2;

public class DeleteANumbergivenString {

	public static void main(String[] args) {
	String t="";
	String s="a2b3c6#A";
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		//if(Character.isDigit(c)) 
		//if(c>=48 && c<=57)
		if(c>='0' && c<='9')
		{
			
		}
		else
		{
			t=t+c;
		}
	}
	System.out.println(t);//abc#A

	}
	}
