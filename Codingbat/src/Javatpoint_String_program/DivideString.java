package Javatpoint_String_program;

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="aaaabbbbcccc";
      int len=s.length();
      int n=3;
      int temp=0,chars=len/n;
      String[] equalStr=new String[n];
      if(len%n!=0) {
    	  System.out.println("Sorry this string cannot be divided into"+n+"equals parts");
    	  
    	  
    	  
      }
      else {
    	  for (int i = 0; i <len;i= i+chars)
    	  {
			String part = s.substring(i,i+chars);
			equalStr[temp]=part;
			temp++;
			
		}
    	  System.out.println(n+"equals parts of given String are");
    	  for (int i = 0; i < equalStr.length; i++)
    	  {
			System.out.println(equalStr[i]);
			
		}
      }
		
		
	}

}
