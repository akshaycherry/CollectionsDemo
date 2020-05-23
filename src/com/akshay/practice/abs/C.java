package com.akshay.practice.abs;

public class C extends A{
	public void c(){
		System.out.println("This is abstract class A c method");
	}
	public void d(){
		System.out.println("This is abstract class A d method");
	}
	public A akshay() {
		return new C();
	}
	public static void main(String[] args) {
		A a;
		a=new C();
		a.a();
		a.b();
		a.c();
		a.d();
		a.akshay();
	}

}
