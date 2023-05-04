package String2;

public class removeDuplicatefromString {

	public static void main(String[] args) {
  String s="bananas";
  String t=" ";
  while(s.length()>0) {
	  char c=s.charAt(0);
	  t=t+c;
	  s=s.replace(" "+c," ");
  }
  System.out.println(t);
	
	}

}
