package String2;

import java.util.Arrays;

public class OccOddTimes {

	public static void main(String[] args) {
		String s="eabddceadebaef";
		char ar[]=s.toCharArray();
		Arrays.sort(ar);
		s=new String(ar);
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				if(c%2==1) {
					System.out.println(""+s.charAt(i)+c);
				}

				c=1;
			}
		}
		if(c%2==1) {
			System.out.println(""+s.charAt(s.length()-1)+c);
		}
	}

}
