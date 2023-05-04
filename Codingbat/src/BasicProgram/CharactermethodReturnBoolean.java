package BasicProgram;

public class CharactermethodReturnBoolean {

	public static void main(String[] args) {
		boolean a=Character.isUpperCase('A');
		System.out.println(a);//True
		System.out.println("---------------------");
		
		boolean b=Character.isUpperCase('t');
		System.out.println(b);//False
		System.out.println("---------------------");
		
		boolean c=Character.isLowerCase('A');
		System.out.println(c);//False
		System.out.println("---------------------");
		
		boolean d=Character.isLowerCase('a');
		System.out.println(d);//True
		System.out.println("---------------------");
		
		boolean e=Character.isLetter('A');
		System.out.println(e);// true
		System.out.println("---------------------");
		
		boolean f=Character.isDigit('1');
		System.out.println(f);//true
		System.out.println("---------------------");
		
		boolean g=Character.isLetterOrDigit('6');
		System.out.println(g);//True
		System.out.println("---------------------");
		
	
		System.out.println(2+3+"Hii"+2+3);
		System.out.println("---------------------");//5Hii23
		
		String s1=null;
		System.out.println(s1);
		System.out.println("---------------------");
	
	
		String s=String.valueOf(5);
		System.out.println(s);//5
	}

}
