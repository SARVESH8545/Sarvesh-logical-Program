package String2;

import java.util.Arrays;

public class OccNotchangeStringOrder {

	public static void main(String[] args) {
		String s="bananas";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		String sorted=new String(ar);
		while(s.length()>0){
			char c=s.charAt(0);
			int occ=sorted.lastIndexOf(c)-sorted.indexOf(c)+1;
			System.out.println(""+c+occ);
			s=s.replace(""+c,"");
		}	
	}
}
