package com.bjs;

public class Resume {
	public void carrierobjective() {
		String string="To become a successfull software Engineer";
		System.out.println("CarrierObjective"+string);	
	}
	public void academicdetials() {
		String highschool="AND Inter college";
		float per=71.17f;
		String inter="AND Inter college";
		float percentage=80.20f;
		System.out.print(highschool);
		System.out.print("-with"+per+"%");

		System.out.println("--------------------------------");
		System.out.print(inter);
		System.out.println("-with"+percentage+"%");
	}
	public void addressdetials() {
		String vill="xyz";
		String post="Abc";
		String dist="mno";
		System.out.println("Village :"+vill+"\nPOST :"+post+"\nDIST :"+dist);

	}

	public static void main(String[] args) {
		Resume resume=new Resume();
		resume.carrierobjective();
		resume.academicdetials();
		resume.addressdetials();
	}

}
