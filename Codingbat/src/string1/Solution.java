package string1;

/*public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer value");
        int i = scan.nextInt();
        System.out.println("Enter the Double value");
        double d=scan.nextDouble();
        System.out.println("Enter the  string ");
        String s=scan.nextLine();
        // Write your code here.

        
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.println("String: " + s);
    }
}
