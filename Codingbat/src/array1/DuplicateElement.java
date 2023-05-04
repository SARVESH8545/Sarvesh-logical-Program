package array1;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[]={1,2,3,4,2,7,8,8,3};
		System.out.println("Duplicate Element in given array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					System.out.print(a[j]+" ");
				}
			}
		}

	}

}
