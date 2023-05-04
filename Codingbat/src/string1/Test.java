package string1;

public class Test {

	public static void main(String[] args) {
		/*
		 * int arr[]= {5,1,3,8,3,1,9,4,6,7}; Arrays.sort(arr,4,8); String
		 * s=Arrays.toString(arr); System.out.println(s);
		 */
		String s="madam";
		System.out.println("S is "+s);
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println("SB is "+sb);
		if (s.equals(""+sb)) {
			System.out.println("Polindrome String");
			
		}else {
			System.out.println("Not ");
		}
		
		
	
	}
}
