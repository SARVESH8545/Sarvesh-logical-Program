package bjs.array;
// wap we have one array name is number=[100, 90,25,6,400,2,95]
// 1-min,2-max,3-z=max+min,4-zis even or Not

// wap java program find out 2nd max and 2nd min

//wap [9,3,5,9,3,9,2,9]
// ans 9-4times,3-2times

// wap create one array and store your 4 friends name find out longest fraeinds name
public class Array9 {

	public static void main(String[] args) {
		int number[]= {100,90,25,6,400,2,95};
		int min=number[0]; //100
		for (int i = 0; i < number.length; i++) {
			if (min>number[i]) { //100>90
				min=number[i];
			}
		}
		System.out.println("Min :"+min);

		int max=number[0]; //100
		for (int i = 0; i < number.length; i++) {
			if (max<number[i]) { //100>90
				max=number[i];
			}
		}
		System.out.println("Max :"+max);
		
		int z=min+max;
		System.out.println("Z :"+z);
		if (z%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}

}
