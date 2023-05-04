package BasicProgram;

public class Break {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<100;j++) {
				System.out.print(j);
				/*output
			01
            01
            01
				 */
				if(j==1) {
					break;
				}
			}
			System.out.println();
		}
	}
}
