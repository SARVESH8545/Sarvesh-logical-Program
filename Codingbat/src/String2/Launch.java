package String2;

public class Launch {

	public static void main(String[] args) {
		String s="this is  my class.";
		String ar[]=s.split(" ");

		for (String data:ar) 
		{
			String res=toUp(data);

			System.out.println(res);
		}
	}
	static String toUp(String s) {
		//System.out.println(s.toUpperCase());
		return s.toUpperCase();
	}

}
