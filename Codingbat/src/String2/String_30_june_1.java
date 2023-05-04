package String2;

public class String_30_june_1 {

	public static void main(String[] args) {
		
		String string="The quick brown for jumps over a lazy dog";
		int c=0;
		for (int i =65; i < 90; i++) {
			if(string.contains(""+(char)i)) {
				c++;
			}
		}
			if(c==26) {
				System.out.println("Panagram");
			}else {
				System.out.println("Not a Panagram"); //Not a Panagram
			}
		

	}

}
