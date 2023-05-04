package BasicProgram;

public class factorNO{

	public static void main(String[] args) {
		/*int n=6;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			System.out.println(i);
	}*/
		int n=20;
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
				System.out.println(i);
			}
		}
	}
}