package String2;

import java.util.Arrays;

public class OccString3 {

	public static void main(String[] args) {

		String s="eabdceadebace";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		s=new String(ar);
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {

			}
			else {
				System.out.println(i);
			}
		}
		//System.out.println(s.charAt(s.length()-1));
	}

}
