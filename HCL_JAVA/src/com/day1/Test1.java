class Test1 
{
	
	public static void main(String[] args) 
	{
		int i,j,num=0;
		for(i=5;i>=1;i--){
		for(j=0;j<i;j++)
			num+=i;
		}
		System.out.println(num);
	}
}
