package BasicProgram;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int n=17;
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%2==0) {
				c++;
				break;
			}
		}
		if(c==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime Number");
		}

	}

}
