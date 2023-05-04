class ArrayID 
{
	public static void main(String[] args) 
	{ 
		int sum=0;
		int[] a=new int[]{2,3,5,7,15,21};
		for(int i=0;i<a.length;i++){
			if(a[i]%21==0){
			a[i]=a[i]*4;
			}
			else if(a[i]%3==0)
			{
				a[i]=a[i]*2;
			}
			else if(a[i]%7==0)
			{
				a[i]=a[i]*3;
			}
			}
			for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			}
			System.out.println(sum);
	}
}
