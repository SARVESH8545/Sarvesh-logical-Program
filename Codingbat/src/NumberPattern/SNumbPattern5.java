package NumberPattern;

public class SNumbPattern5 {

	public static void main(String[] args) {
		
		int n=7; 
		
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j<=n-1-i)
				{
					System.out.print(n-j);
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
