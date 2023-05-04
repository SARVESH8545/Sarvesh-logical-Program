package String2;

import java.util.Arrays;

public class OccuranceExactly2times {

	public static void main(String[] args) {
		String s="abacdadebaee";
		String t="";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		//System.out.println(ar);
		s=new String(ar);
		while(s.length()>0) {
			char c=s.charAt(0);
			int occ=s.lastIndexOf(c)+1;
			if(occ==2) {
				t=t+c;
			}
			s=s.replace(""+c,"");
		}
		System.out.println(t);

	}
}
