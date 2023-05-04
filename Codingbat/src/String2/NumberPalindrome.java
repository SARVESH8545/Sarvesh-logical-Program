package String2;

public class NumberPalindrome {

	public static void main(String[] args) {
		int n=121;
		String s=""+n;

		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.equals(""+sb)){
			System.out.println("Palindrome NUmber");

		}else {
			System.out.println("Not a Polidrome Number");
		}


	}}
