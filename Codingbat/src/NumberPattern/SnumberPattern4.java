package NumberPattern;

public class SnumberPattern4 {

	public static void main(String[] args) {
		int n=14;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=n/2-i)
				{
					System.out.print(j+" ");
					
				}
				}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i-n/2)
				{
					System.out.print(j+" ");
					
				}
				
			}
			System.out.println();
		}


	}

}
