package NumberPattern;

public class SNmuberPattern9 {

	public static void main(String[] args) {
		int n=7;
		for(int i=0;i<n;i++)
		{
			
		for(int j=0;j<n;j++) {
			if(j>=i) {
				System.out.print(j+1);
			}else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			
		for(int j=0;j<n;j++) {
			if(j>=n-i-1) {
				System.out.print(j+1);
			}else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}


	}

}
