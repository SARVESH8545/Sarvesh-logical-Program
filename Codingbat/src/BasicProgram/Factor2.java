package BasicProgram;

public class Factor2 {

	public static void main(String[] args) {
		int n=1000;
		System.out.println(1); //1
		for(int i=2;i<=n/2;i++) { //1000/2=500
			
			if(n%i==0) {
				System.out.println(i);
			}
		}
		System.out.println(n); //1000

	}

}
/*
1
2
4
5
8
10
20
25
40
50
100
125
200
250
500
1000
*/