package String2;

import java.util.Arrays;

public class SortandconvertStringtoarray {

	public static void main(String[] args) {
		String s="zbcadabca";
		char[] c=s.toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		//String t=new String(s);
		//	System.out.println(t);
	}
}
