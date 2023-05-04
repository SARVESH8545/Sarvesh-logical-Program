package bjs.array;

public class DuplicateElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,2,7,8,8,3};
		System.out.println("Duplicate elements in given array: ");  
		for (int i = 0; i < arr.length; i++) {//i=0 0<7, i=1 1<7
			for (int j = i+1; j < arr.length; j++) {//j=1 j===> 1<7, j=2 
				if (arr[i]==arr[j]) {// 1==2
					System.out.println(arr[j]);

				}

			}

		}

	}

}
