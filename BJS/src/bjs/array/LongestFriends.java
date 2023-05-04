package bjs.array;

public class LongestFriends {

	public static void main(String[] args) {
		
		String friends[]= {"ayush","raja","rajarammohan","rajaram"};
         int maxlen=0;
         String longname=null;
         for (String s : friends) { 
			if (s.length()>maxlen) { //5>0
				maxlen=s.length(); //5
				longname=s;//ayush
			}
		}
         System.out.println(longname);
	}

}
// in the above find out smallest lenght of program