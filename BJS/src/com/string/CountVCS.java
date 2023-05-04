package com.string;

// Write a Program count vowel consonants,number and special symbols in string.
import java.util.Scanner;

public class CountVCS {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter mixed String");
//		String string="SarveshKumarPandey@#$%^&1234";
		String string=scanner.nextLine();
		char c[]=string.toCharArray();
		int size=c.length;
		int vcount=0;
		int ccount=0;
		int scount=0;
		int ncount=0;
		int i=0;
		while(i!=size) {
			if (((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i]<='Z')) || (c[i]>='0'&& c[i]<='9') ) {
				if ((c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'||c[i]=='u') ||
						(c[i]=='A'|| c[i]=='E'|| c[i]=='I'|| c[i]=='O'||c[i]=='U'))
				{
					++vcount;
				}else if(c[i]>='0' && c[i]<='9'){
					++ncount;
				}
				else {
					++ccount;
				}
			}
			else {
				++scount;
			}
			++i;
		}
		System.out.println("VCOUNT :"+vcount);
		System.out.println("CCount :"+ccount);
		System.out.println("SCount :"+scount);
		System.out.println("NCOUNT :"+ncount);

	}

}
