package bjs.array;

public class SortAsc {

	public static void main(String[] args) {
		int  arr[]= {5,8,2,1,3};
		int temp=0;
		System.out.println("Orignal Array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {

					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;

				}
			}
		}
		System.out.println();
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);

		}

	}

}
