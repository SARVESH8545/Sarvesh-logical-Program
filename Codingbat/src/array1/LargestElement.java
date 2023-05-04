package array1;

public class LargestElement {

	public static void main(String[] args) {
	int []a=new int[] {25,11,7,75,56};
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		//System.out.println("number of array element"+a.length);
		if(a[i]>max)
		{
			max=a[i];
			}
	}
	System.out.println("Largest element in given array:"+max);
	
	}

}
