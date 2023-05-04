package bjs.array;

public class EvenPosition {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6};
		System.out.println("Even Position Array Element");
		for (int i = 1; i < array.length; i=i+2) {
			System.out.println(array[i]);
			
		}
		System.out.println();
		System.out.println("ODD Position Element");
		for (int i = 0; i < array.length; i=i+2) {
			System.out.println(array[i]);
			
		}

	}

}
