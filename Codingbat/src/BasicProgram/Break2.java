package BasicProgram;

public class Break2 {

	public static void main(String[] args) {
	abc:for(int i=0;i<3;i++) {
		for(int j=0;j<100;j++) {
			System.out.println(j);
			if(j==1) {
				break abc;
			}
		}
		System.out.println();
	}
	}
}
// out put=01