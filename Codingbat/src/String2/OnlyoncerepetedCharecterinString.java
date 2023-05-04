package String2;

public class OnlyoncerepetedCharecterinString {

	public static void main(String[] args) {
      String s="SILLYSPIDER";
      for(int i=0;i<s.length();i++) {
    	  char c=s.charAt(i);
    	  if(s.indexOf(c)==s.lastIndexOf(c)) 
    		  System.out.println(c);
    	  
      }
		
		
	}

}
