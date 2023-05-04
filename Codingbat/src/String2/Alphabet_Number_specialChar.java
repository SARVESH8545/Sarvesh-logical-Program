package String2;

public class Alphabet_Number_specialChar {

	public static void main(String[] args) {
     String s="Sarvesh Pandey 9140194714 skpandey10695@gmail.com";
     int vc=0;int cc=0;int num=0;int space=0;int specialChar=0;
     for(int i=0;i<s.length();i++) 
     {
    	 char c=s.charAt(i);
    	 if(Character.isLetter(c)) 
    	 {
    		 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
    			 vc++;
    		 }else
    		 {
    			 cc++;
    		 }
    	 }
    		 else if(c>='0'&& c<='9')
    		 {
    			 num++;
    		 }
    		 else if(c==' ')
    		 {
    			 space++;
    		 }
    		 else
    		 {
    			 specialChar++;
    		 }
    	 
     }
     System.out.println("Vowel Count is::"+vc);
     System.out.println("Consonent Count is"+cc);
     System.out.println("Number count is::"+num);
     System.out.println("Number of space::"+space);
     System.out.println("Special character is::"+specialChar);
     
     
	}

}
