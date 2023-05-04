package BasicProgram;

public class Exampleofcontinueandbreak {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(1);
			if(i<=2) {
				continue;
			}
			System.out.println(2);
			if(i==5) {
				break;
			}
			System.out.println(3);
		}// end of for loop

	}

}
// output1
/*1
1
1
1
2
3
1
2
3
1
2
*/
