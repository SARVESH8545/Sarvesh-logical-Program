package Javatpoint_String_program;

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Remove White spaces";
       s=s.replaceAll("\\s+","");
       System.out.println(s);
	}

}
