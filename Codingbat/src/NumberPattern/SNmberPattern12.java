package NumberPattern;

public class SNmberPattern12 {

	public static void main(String[] args) {
		int n=7;
		for (int i = 0; i<n; i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i+j+1)%2);
			}
			System.out.println();
		}
	}

}
