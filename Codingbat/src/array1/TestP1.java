package array1;

public class TestP1 {

	public static void main(String[] args) {
		// Java Program to copy all elements of one array into another array
		int a[]= {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

}
