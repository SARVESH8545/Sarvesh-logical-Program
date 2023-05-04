import java.util.Scanner;
class DoubleOpt
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value a:");
		double a=s.nextDouble();
		System.out.println("Enter the Value b:");
		double b=s.nextDouble();
		System.out.println("Enter the Value c:");
		double c=s.nextDouble();
		System.out.println("a+b*c="+(a+b*c));
		
	System.out.println("a*b+c="+(a*b+c));

	System.out.println("c+a/b="+(c+(a/b)));
		
	System.out.println("a+b*c="+((a%b)+c));
			

	}
}
