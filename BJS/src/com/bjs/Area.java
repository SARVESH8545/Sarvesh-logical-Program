package com.bjs;

public class Area {
	public void cricle() {
		int r=5;
		double ar=(Math.PI)*r*r;
		System.out.println("Area of cricle is ="+ar);	 
	}

	public void  square() {
		int sl=4;
		int ar=sl*sl;
		System.out.println("Area of square is ="+ar);
	}
	public void triangle(){
		int base=10;
		int height=5;
		double ar=(0.5)*base*height;
		System.out.println("Area of triangle is ="+ar);
	}

	public void Rectangle() {
		int lenght=50;
		int width=10;
		int ar=lenght*width;
		System.out.println("Area of Rectangle is ="+ar);
	}
	//	public void parallelogram() {
	//		int base=10;
	//		int verticalheight=5;
	//		int ar=base*verticalheight;
	//		System.out.println("Area of parallelogram is ="+ar);
	//}
	//	public void trapezium() {
	//     int a=10;   // a and b are the length of parallel sides
	//     int b=15;
	//     int hight=20;
	//     float ar=(a+b)/2*hight;
	//     System.out.println("Area of trapezium is ="+ar);
	//	}
	//	
	//	public void ellipse() {
	//		int half_minoraxis=10;
	//		int half_majoraxis=20;
	//		double ar=(Math.PI)*half_majoraxis*half_minoraxis;
	//		System.out.println("Area of Ellipse is ="+ar);
	//	}
	public static void main(String[] args) {
		Area area=new Area();
		area.cricle();
		area.square();
		area.triangle();
		area.Rectangle();
		//		area.parallelogram();
		//		area.trapezium();
		//		area.ellipse();
	}

}
