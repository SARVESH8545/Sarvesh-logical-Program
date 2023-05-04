package String2;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {

	public static void main(String[] args) {
		/*How to Convert a String value to Short
		 *  value in Java with Examples
	String str="1";
	System.out.println(Short.valueOf(str));
	System.out.println(Short.parseShort(str));
		
		*/
		
		/*How to Convert a String value to
		 *  Byte value in Java with Examples
		String s="3";
		System.out.println(Byte.valueOf(s));
		System.out.println(Byte.parseByte(s));*/
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
		    String myString=sc.next();
		    int count=0;
		    char tempArray[] = myString.toCharArray(); 
          
        // sort tempArray 
            Arrays.sort(tempArray); 
		    for(int j=1;j<tempArray.length;j++){
		        if(tempArray[j]==tempArray[j-1]){
		            count++;
		        }
		        //System.out.print(tempArray[j]);
		    }
		    //System.out.println();
		    System.out.println(count);
		    //System.out.println(myString);
		    
		}

	}

}
