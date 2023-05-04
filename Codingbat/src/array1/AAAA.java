package array1;

public class AAAA {

	public static void main(String[] args) {
		/*
		 * int arr[]= {1,6,2,5,3,4}; int temp; for (int i = 0; i < arr.length; i++) {
		 * for (int j = 0; j < arr.length; j++) { if(arr[i]<arr[j]) { temp=arr[i];
		 * arr[i]=arr[j]; arr[j]=temp; }
		 * 
		 * } System.out.println(arr[i]); break; }
		 */
		//		String string="abcd";
		//		StringBuffer sBuffer=new StringBuffer(string);
		//		sBuffer.reverse();
		//		System.out.println(sBuffer);

		//prime Number
		int n=16;
		int count=0;
		for (int i = 1; i <=n; i++) {
			if (n%i==0) {
				
		count++;	
			}
			
		}
		if (count==2) {
			System.out.println("prime Number");
			
		}
		else {
			System.out.println("Not a prime nUmber");
		}
	}
}