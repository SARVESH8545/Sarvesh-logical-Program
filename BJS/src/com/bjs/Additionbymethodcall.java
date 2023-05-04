package com.bjs;

public class Additionbymethodcall {
	
    public void add() {
    	int a=30;
    	int b=20;
    	int c=a+b;
    	System.out.println("Sum :"+c);
		}
    private void sub() {
		int a=50;
		int b=20;
		int c=a-b;
		System.out.println("Sub :"+c);
	}
     
    private void mul() {
    	int a=10;
    	int b=5;
    	int c=10*5;
    	System.out.println("Multiple c:"+c);
		
	}
	public static void main(String[] args) {
		Additionbymethodcall additionbymethodcall=new Additionbymethodcall();
		additionbymethodcall.add();
       additionbymethodcall.sub();
       additionbymethodcall.mul();
	}

}
