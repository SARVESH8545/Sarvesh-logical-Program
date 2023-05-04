package string1;

public class SentenseReversal {

	public static void main(String[] args) {
		/*String s="I Live in India";
		String[] split=s.split("");
		String result="";
		for(int i=split.length-1;i>=0;i--) {
		result+=split[i]+"";	
		}
		System.out.println(result.trim());*/
		try {
			String str = "Java is a Programming Language.";
			String res = " ";
			String split[] = str.split(" ");
			for (int i =split.length-1; i >= 0; i--) {
			res = res + split[i] + " ";


			}
			System.out.println("String is :"+str);
			System.out.println("Reversed Word String is :"+res);

			} catch (Exception e) {
			e.printStackTrace();
			}



	}

}
