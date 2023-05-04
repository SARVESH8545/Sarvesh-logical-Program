package com.string;
// Wap to verify one string is a rotatinal of another string
public class RotatinalString {

	public static void main(String[] args) {
    String originalString="ARADHYA";
    String keyString="RADHYAA";
   String newString=originalString.concat(originalString);
   if (newString.contains(keyString)) {
	   System.out.println("Rotatinal String");
	}
   else {
	System.out.println("Not Rotatinal String");
}

	}

}
