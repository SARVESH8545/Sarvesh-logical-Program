package NumberPattern;

public class NUmberPattern {

	public static void main(String[] args) {
		int n=11; 
	      for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j>=n/2-i && j<=n/2)
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

