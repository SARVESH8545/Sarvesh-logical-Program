package bjs.array;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Orignal Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
			
		}
		System.out.println();
		System.out.println("Array in reverse Order");
		for (int i = arr.length-1; i>=0; i--) {//4 4>=0 
			System.out.print(" "+arr[i]);
			
		}
	}

}
