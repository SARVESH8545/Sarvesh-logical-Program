package String2;
// WAP display last Index Character
import java.util.Scanner;
public class str7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int lastIndex=s.length()-1;
		char c=s.charAt(lastIndex);
		System.out.println(c);
	}

}
