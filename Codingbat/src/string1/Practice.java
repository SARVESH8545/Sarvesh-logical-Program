package string1;



public class Practice {


	static void m1(int a) {
		System.out.println("before if");
		if(a==10) {
			System.out.println("in if");
			return;
		}
		System.out.println("after if");
		System.out.println("hii");
	}
	static int m2(int a) {
		System.out.println("before if");
		if(a==10) {
			System.out.println("in if");
			return a+10;
		}
		System.out.println("after if");
		System.out.println("hii");
		return 50;
	}
	public static void main(String[] args) 
	{
		//m1(10);
		//m1(20);
		m2(10);
		m2(20);
	}


}




