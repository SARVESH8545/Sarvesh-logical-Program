package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>=n/2-i && j<=n/2+i && i<=n/2 ||(j>=n/4 && j<=3*n/4 && j>=i-n/2 && j<=n+n/2-1-i && i>=n/2)) {
	
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
