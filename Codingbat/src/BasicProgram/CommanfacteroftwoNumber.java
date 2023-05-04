package BasicProgram;

public class CommanfacteroftwoNumber {

	public static void main(String[] args) {
		int m=15;
		int n=10;
		for (int i=1; i<=n; i++) {
			if(m%i==0 && n%i==0) {
				System.out.println(i);
			}
		}
	}
}
// output:1,5