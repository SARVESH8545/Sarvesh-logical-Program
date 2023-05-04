package bjs.array;

public class Array3 {

	public static void main(String[] args) {
		int data[]= {10,20,30,40};
		for (int i = 0; i < data.length; i++) {
			if(i==2) {
				break;
			}
			System.out.println(data[i]);
		}

	}

}
