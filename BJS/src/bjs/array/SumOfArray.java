package bjs.array;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];//1 1+2 3+3 6+4 10+5
		}
		System.out.println("Array element Sum :"+sum);

	}

}
