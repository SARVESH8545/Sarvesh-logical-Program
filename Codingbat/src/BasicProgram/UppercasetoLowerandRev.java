package BasicProgram;

public class UppercasetoLowerandRev {

	public static void main(String[] args) {
		System.out.println("------Upper Case to loweer Case");
		System.out.println((char)('A'+32));
		System.out.println("------through space-----");
	System.out.println((char)('B'+' '));
	System.out.println("______________________________");
	
	System.out.println("------Lower Case to Upper Case");
	System.out.println((char)('a'-32));
	System.out.println("------through space-----");
    System.out.println((char)('b'-' '));
    System.out.println("_____________________________");
    
    System.out.println("----Through pre-defined method-------");
    char c=Character.toUpperCase('d');
    System.out.println(c);
    System.out.println("-----------------------------------");
    char se=Character.toUpperCase('T');
    System.out.println(se);
    System.out.println("-----------------------------------");
    
    char d=Character.toUpperCase('*');
    System.out.println(d);
    System.out.println("-----------------------------------");
    char e=Character.toUpperCase('6');
    System.out.println(e);
    System.out.println("-----------------------------------");
	}

}
