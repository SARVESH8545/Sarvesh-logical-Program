package NumberPattern;

public class SNumberPattern10 {

	public static void main(String[] args) {
		int n=7; 
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=i)
				{
					System.out.print(j+1+" ");
				}
				else
				{
					System.out.print(" ");
				}
				}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( j>=n-1-i)
				{
					System.out.print(j+1+" ");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

		
		
	}

}
