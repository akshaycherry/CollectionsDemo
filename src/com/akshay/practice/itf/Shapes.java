package com.akshay.practice.itf;

public interface Shapes extends Drawable{
	int age=34;
	void c();
	void d();
    default void z() {
    	Drawable.super.e();
    	System.out.println("This is shapes z method");
    }

}
