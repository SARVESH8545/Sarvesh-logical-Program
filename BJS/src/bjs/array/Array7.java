package bjs.array;

public class Array7 {

	public static void main(String[] args) {
		int data[]= {42,89,23,90,80,50};
		int z=0,x=0;
		
		for (int i = 0; i < data.length/2; i++) {
			z+=data[i];
		}
		System.out.println(z);
		for (int i = 3; i < data.length; i++) {
			x+=data[i];
		}
		System.out.println(x);
		
		int y=x-z;
		System.out.println("Y: "+y);
		
		if (y%2==0 && y%8==0) {
			System.out.println("Yes");
		}else {
			System.out.println("NO");
		}

	}

}
