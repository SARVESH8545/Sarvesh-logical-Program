package bjs.array;
// duplication of program 
public class Array8 {

	public static void main(String[] args) {
		int mobno[]={9,7,3,8,5,4,1,9,3,7};
		int n=mobno.length;
		System.out.println("length of mob no: "+n);
		for (int i = 0; i < n; i++) { //9 outer loop
			
			for (int j =i+1;j<n; j++) { //7 inner loop
				
				if (mobno[i]==mobno[j]) {
					System.out.println(mobno[j]);
				}
			}
		}
		
	}
}

// in avove program we use nested loop if any programs have nexted loop th != null) {
// inner loop will work according to outer loop

// Nexted loop one loop insde other loop is called nexted loop or inner loop
