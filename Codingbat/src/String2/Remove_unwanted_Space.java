package String2;

public class Remove_unwanted_Space {

	public static void main(String[] args) {
		String s="This     is     my     class";
		s=s.replaceAll(" +"," ");
		System.out.println(s);

	}

}
