package String2;

public class FrequencyofCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabccddddeef";
		for(int i=0;i<s.length();)
		{
			char c=s.charAt(i);
			int occ=s.lastIndexOf(c)-s.indexOf(c)+1;
			System.out.println(c+"="+occ+"times");
			i=s.lastIndexOf(c)+1;
		}
	}

}
