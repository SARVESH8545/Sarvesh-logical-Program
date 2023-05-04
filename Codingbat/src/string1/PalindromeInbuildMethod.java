package string1;

class PalindromeInbuildMethod{
	public static void main (String [] args){
		String x="madam";
		char[] y=x.toCharArray();
		int size=y.length;
		char [] a=new char[size];
		int i=0;
		while(i!=size){
			a[size-1-i]=y[i];
			++i;
		}
		i=0;
		while(i!=size){
			if(a[i]!=y[i]) {
				System.out.println("Not a Palindrome String");
				System.exit(0);
			}else{
				++i;
				continue;
			}
		}
		System.out.println("Palindrome String");

		//System.out.println(y);
		//system.out.println(a);
	}
}