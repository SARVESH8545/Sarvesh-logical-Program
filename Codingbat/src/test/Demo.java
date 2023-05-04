package test;

public class Demo {

	public static void main(String[] args) {
		String s="Teeter";
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			if (s.indexOf(c)==s.lastIndexOf(c)) {
				System.out.println(c);
				
			}
			
		}
		/*
		 * int array[]= {10,5,20,30,15}; Arrays.sort(array);// 5,10,15,20,30 int
		 * len=array.length; System.out.println(array[len-2]);
		 */
//		for (int i : array) {
//	  System.out.println(i);
//		}
	}

}
