package com.java_wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
        byte b1=10;
        System.out.println(b1);
        
        Byte b2=new Byte(b1);
        System.out.println(b2);
        
        int i=20;
        int j=30;
        Integer i1=new Integer(i);
        Integer i2=new Integer(j);
        Integer i3=i1+i2;
        System.out.println(i3);
        
        Integer i4=new Integer(1);
        Integer i5=new Integer("2");
        Integer i6=i4+i5;
        System.out.println(i6);
	}

}
