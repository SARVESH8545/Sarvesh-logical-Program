package BasicProgram;

public class Characterpredefinde {

	public static void main(String[] args) {
		System.out.println("------Character to Integer------");
		System.out.println((int)'A');  //65
		System.out.println((int)'a');  //97
		System.out.println((int)'0');  //48
		System.out.println((int)' ');  //32
		
		System.out.println("-----------------------------------");
		
		System.out.println("------INteger to Character------");
		System.out.println((char)65);  //A
		System.out.println((char)49);  //1
		System.out.println((char)99);  //c
		
		System.out.println("----------------------------------");
		
		System.out.println(((int)'A')+1);  //66
		
		System.out.println("--------------------------------");
		
		System.out.println('A'+'A');      //130
		
		System.out.println("--------------------------------");
		
		System.out.println((char)'A'+2);  //67
		
		System.out.println("--------------------------------");
		
		System.out.println((char)('A'+2));  //C

	}

}
