package bjs.array;

public class LargestElement_array {

	public static void main(String[] args) {
		int arr[]= {25,11,7,75,38};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
				
			}
			
		}
		System.out.println("Largest Element_Array :"+max);
		System.out.println();
		int min=arr[0];//25
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {//25<25 11<25
				min=arr[i];
				
			}
			
		}
		System.out.println("Smallest Element_Array :"+min);
	}

}
