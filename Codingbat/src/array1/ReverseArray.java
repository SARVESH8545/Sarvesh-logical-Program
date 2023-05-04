package array1;

import java.util.Arrays;

// Java Program to print the elements of an array in reverse order
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4,5};
		System.out.println("Print reverse element array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
//		String s=Arrays.toString(a);
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
		//System.out.println(s);
		
		
	}

}
