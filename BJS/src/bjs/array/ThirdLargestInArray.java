package bjs.array;

public class ThirdLargestInArray {

	public static void main(String[] args) {
		int arr[]= {44,66,99,77,33,22,55};
		int temp=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}

			}
		}
		System.out.println("Third Largest Value: "+arr[arr.length-3]);


	}

}
