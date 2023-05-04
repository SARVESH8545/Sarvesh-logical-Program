package bjs.array;

public class MinMaxData {
	static void min(int data[]){
		int min=data[0];
		for (int i = 0; i < data.length; i++) {
			if (min>data[i]) {
				min=data[i];
			}
		}
		System.out.println(min);
	}
	
	static void max(int data[]){
		int max=data[0];
		for (int i = 0; i < data.length; i++) {
			if (max<data[i]) {
				max=data[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int bjs[]= {28,14,9,1,59,49};
       min(bjs);
       max(bjs);
	}

}
