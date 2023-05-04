package com.bjs;

public class Area2 {

	public void solidcricle() {
		int r=2;
		double area=(Math.PI)*r*r;
		System.out.println("Area of solidCricle :"+area);
	}
	
	public void semiCricle() {
		int r=2;
		double area=((Math.PI)*r*r)/2;
		System.out.println("Area of semiCricle :"+area);
		}
	public void cone() {
		int r=2;
		int h=4;
		double area=(Math.PI)*r*(Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2)));
		System.out.println("Area of cone :"+area);
	}
	public static void main(String[] args) {
		Area2 area2=new Area2();
		area2.solidcricle();
		area2.semiCricle();
		area2.cone();
	}

}
