package String2;

public class String_count {

	public static void main(String[] args) {
	/*	String s="1a3c7";
		int slap=0;
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			if(c>='0'&& c<='9') {
				//empty
			}
			else {
			slap++;	
			}
			if(slap==0) {
				System.out.println();
			}else {
			System.out.println();
		}
			}*/
		String s="1ab3c";
		try {
			int n=Integer.parseInt(s);
			System.out.println("Number");
		} catch (Exception e) {
			
			System.out.println("NOT a number");
		}

	}

}
