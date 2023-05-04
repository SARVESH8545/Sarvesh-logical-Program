import java.util.*;

class SumofN 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int sum=0;
		int N=sc.nextInt();
		if(N>0){
		for(int i=1;i<=N;i++){
		
	sum+=i;
			
		}
		System.out.print(sum);
		}
	}
}
