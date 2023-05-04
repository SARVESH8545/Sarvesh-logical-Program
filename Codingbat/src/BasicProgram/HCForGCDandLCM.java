package BasicProgram;

public class HCForGCDandLCM {

	public static void main(String[] args) {
		int m=15,n=10;
		int hcf=0;
		for (int i = 1; i <=n; i++) {
			if(m%i==0 && n%i==0) {
				hcf=i;
			}
		}
		/*int product=m*n;
	int lcm=product/hcf;
			System.out.print(lcm);
		 */
		System.out.println(hcf);
	}
}


