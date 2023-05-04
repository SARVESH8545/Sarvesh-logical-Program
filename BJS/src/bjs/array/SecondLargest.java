package bjs.array;

public class SecondLargest {

	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};
		int n=a.length;
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		System.out.println("Second Largest Number:"+a[n-2]);


		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				if (a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}}}
		System.out.println("Second Smallest  Number:"+a[n-2]);
	}
}
