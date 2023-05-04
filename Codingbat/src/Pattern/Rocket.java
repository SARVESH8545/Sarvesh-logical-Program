package Pattern;

public class Rocket {

	public static void main(String[] args) 
	{
		int n=9; 
		for(int i=0;i<n;i++)
		{
		  for (int j = 0; j < n; j++) 
		  {
			System.out.print(" ");
		 } // end of for j1
		  for (int j = 0; j < n; j++) 
		  {
			  if(j>=n-1-i&&j<=i&&i>=n/2) {
			  System.out.print("*");
		}
			  else {
			System.out.print(" ");
		}
			  }
		  System.out.println();
		}
		
		  for (int i= 0; i < n; i++) 
		{
		for(int j=0;j<n;j++) {
	System.out.print(" ");
		}	
		for(int j=0;j<n;j++) {
			System.out.print("*");
		}
	System.out.println();
		}
	
		for ( int i = 0; i < n; i++)
		{
			for(int j=0;j<n;j++) {
				if(j>=n-1-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			for(int j=0;j<n;j++) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
}

