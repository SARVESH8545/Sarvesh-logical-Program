class CountVowelConsonant 
{
	public static void main(String[] args) 
	{
		int Vcount=0,Ccount=0;
		String str="This is a really Simple sentence";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
		Vcount++;
		}
		 else if(str.charAt(i) >= 'a' && str.charAt(i)<='z'){
		Ccount++;
		}
		}
		System.out.println("Number of Vowels :"+Vcount);
        System.out.println("Number of Vowels :"+Ccount);

	}
}
