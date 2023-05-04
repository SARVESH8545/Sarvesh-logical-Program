class Rk   
{
	public static void main(String[] args) 
	{ int n=15;
	for(int i=0;i<n;i++)
		{
         for(int j=0;j<n;j++)
			{
			if(j==n/2-i||j==n/2+i)
			
				{ 
				 System.out.print("*");
	
				}
		   else
			{
               System.out.print(" ");
           	}
			}
		}
			for(int i=0;i<n;i++)
			{
			 for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=n-1-i; k++)
        {
            System.out.print("*" + " ");
        }
			}
        System.out.println();
    }
		
	}
	
	

