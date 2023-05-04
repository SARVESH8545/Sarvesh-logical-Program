package String2;

import java.util.Arrays;

public class OccuranceofString2 {

	public static void main(String[] args) {
		String s="eabdceadebae";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		//System.out.println(ar);
		s=new String(ar);
		while(s.length()>0) {
			char c=s.charAt(0);
			int occ=s.lastIndexOf(c)+1;

			System.out.println(""+c+occ);
			s=s.replace(""+c,"");
		}
	}
}
