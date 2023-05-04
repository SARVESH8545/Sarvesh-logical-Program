package Javatpoint_String_program;

public class count_String_length {

	public static void main(String[] args) {
		String s="The best of both worlds";
//		System.out.println(s.length());
int count=0;
for (int i = 0; i <s.length(); i++) {
	if(s.charAt(i)!=' ')
	{
		count++;
	}
	
}
System.out.println("Total number of Character in astring:"+count);
	}

}
