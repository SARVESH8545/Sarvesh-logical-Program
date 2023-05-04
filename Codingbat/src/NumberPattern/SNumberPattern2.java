package NumberPattern;

public class SNumberPattern2 {

	public static void main(String[] args) {
		int  n= 7;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
		
				if(j<=n-2-i) {
				System.out.print("1");
				}
			else
			{
				System.out.print(i+1);
				}
				}
			System.out.println();
		}

	}

}
