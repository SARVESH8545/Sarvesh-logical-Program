class output  
{
	public static void main(String[] args) 
	{
		/*int x,y=1;
		x=10;
		if(x!=10 && x/0==0)
		System.out.println(y);
		else
			System.out.println(++y);*/
			int sum;
			public int callResSum(int n){
			if(n==1){
			return sum;
			}
			else{
			sum+=n%10;
			CallRecSum(n/10);
			}
			return sum;
			}
	}
}
