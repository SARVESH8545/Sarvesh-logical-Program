 package array1;
 

public class CopyArray {

	public static void main(String[] args) {
		//initialize array
		int []arr1={1,2,3,4,5};
		// create another array arr2 with size of arr1
		int arr2[]=new int[arr1.length];
		//Copying all the element of one array into another
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		/*
		// Display element of array arr1
		System.out.println("Elements of original array:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();*/
		System.out.println("Element of new array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}

	}

}
