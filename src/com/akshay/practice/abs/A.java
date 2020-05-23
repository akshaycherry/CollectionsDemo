package com.akshay.practice.abs;

 public abstract class A implements B {
	 A(){
		 System.out.println("This is class A constructor");
	 }
	int age;
	abstract void c();
	abstract void d();
	public void a(){
		System.out.println("This is interface B a method");
	}
	public void b(){
		System.out.println("This is interface B b method");
	}
	public abstract A akshay();
	
}
