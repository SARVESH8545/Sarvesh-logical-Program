package array1;

public class RotateRight {

	public static void main(String[] args) {
		int [] a=new int[]{1,2,3,4,5};
int n=3;
//Displays original array
System.out.println("Original array:");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");	
}
//Rotate the given array by n times to words right
for(int i=0;i<n;i++)
{
int j,last;
//stores the last element of array
last=a[a.length-1];
for(j=a.length-1;j>0;j--)
{
//Shift element of array by one
	a[j]=a[j-1];
}
// last element of array will be add to start of array
a[0]=last;
}
System.out.println();
System.out.println("Array ofter right rotation:");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");	
}
	}

}
