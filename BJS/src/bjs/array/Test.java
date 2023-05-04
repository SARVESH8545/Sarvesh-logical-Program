package bjs.array;
import java.util.Scanner;
class Test{

	public static void main(String []args)
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		//Entre Size of Array
		int ar[]=new int[n];
		//Enter element into the Array
		System.out.println("Enter array value:");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int c=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++) {

				if(ar[i]!=0 && ar[i]==ar[j]){
					c++;
					ar[j]=0;
				}
			}  
			if(ar[i]!=0)
			{
				System.out.println(ar[i]+"---"+c);
			}
		}  


	}

}
