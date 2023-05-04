package string1;

public class ReverseString {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String string=sc.next();
		String reversedStr=" ";
		for(int i=string.length()-1;i>=0;i--) {
			reversedStr=reversedStr+string.charAt(i);
		}
		System.out.println("original string:"+string);
		System.out.println("-------------------------");
		System.out.println("Reversed string:"+reversedStr);
		*/
//		String string="  Sarvesh   Pandey  ";
//		String rev=" ";
//	 for (int i =(string.length()-1);i>=0; i--) {
//		 rev=rev+string.charAt(i);
//		}			
//	 System.out.println(" "+rev);
//	}

		String string="madam";
		StringBuffer sBuffer=new StringBuffer(string);
		sBuffer.reverse();
		//System.out.println(sBuffer);
		if (string.equals(""+sBuffer)) {
			System.out.println("Palindrome string");
			
		}else {
			System.out.println("not palindrome ");
		}
		
		}
	
}
