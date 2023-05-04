package String2;

public class aPpLe_Apple {

	public static void main(String[] args) {
		String s="aPple";
		String sh=s.substring(1);
		System.out.println(sh);//Pple
		sh=sh.toLowerCase();  
		System.out.println(sh); //pple
		String fh=""+s.charAt(0);
		System.out.println(fh);//a
		fh=fh.toUpperCase();
		System.out.println(fh);//A
		System.out.println(fh+sh); //Apple
		

	
		
	}

}
