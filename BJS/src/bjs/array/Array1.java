package bjs.array;

public class Array1 {

	public static void main(String[] args) {
		String taj[]=new String[3];
		taj[0]="sarvesh";
		taj[1]="pandey";
		taj[2]="ece";
		System.out.println(taj[2]);
		int firstSem[]= new int[] {70,80,90,80,70,90};
		int total=0;
		for (int i = 0; i < firstSem.length; i++) {
			total=total+firstSem[i];
		}
		int avg=total/firstSem.length;
		System.out.println(avg);

		String name[]= {"sarvesh","Pandey","ece","76%"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(" "+name[i]);
		}
	}
}
