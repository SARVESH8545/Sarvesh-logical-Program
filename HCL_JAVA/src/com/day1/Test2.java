class Test2
{
	public static void main(String[] args) 
	{
		int a=8;
		int b=a++ % ++a;
		int c=a++ + --b * --a + a-- / ++b - --b + a++ % ++a * --b %3 + ++b %(a*a*b*b*b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
