package String2;

public class Str1 {

	public static void main(String[] args) {
String s=new String("rama");
String t=new String("rama");
String p="rama";
String q="rama";
StringBuffer sb=new StringBuffer("rama");

System.out.println(p==q);//true
System.out.println(s==t);//false
System.out.println(s==p);//false
System.out.println(""+sb);//rama
System.out.println("__________________________");

System.out.println(p.equals(q));//true
System.out.println(s.equals(t));//true
System.out.println(s.equals(p));//true
System.out.println(s.equals(sb));//false
System.out.println("----------------------------");
String a="abcd";
a=a.toUpperCase();
System.out.println(a);
System.out.println("-------------------------------");
StringBuffer ab=new StringBuffer("abcd");
System.out.println(ab.reverse());
System.out.println(ab);
System.out.println("_______________________________");
StringBuilder sss=new StringBuilder("asdfgh");
System.out.println(sss.reverse());

	}

}
