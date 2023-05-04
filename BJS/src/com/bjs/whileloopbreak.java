package com.bjs;

public class whileloopbreak {

	public static void main(String[] args) {
		int i=0;
		while (i<5) {
			System.out.println(i);
			i++;
			if(i==3) {
				break;
			}
			
		}
	}

}
/*0
1
2
*/

