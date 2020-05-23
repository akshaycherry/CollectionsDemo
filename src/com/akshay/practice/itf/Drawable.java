package com.akshay.practice.itf;

public interface Drawable {
	int age=24;
	void a();
	void b();
	default void e() {
		System.out.println("Drwable e method");
	}
	static void f() {
		System.out.println("Drawble f method");
	}
	public interface Diamond{
		
	}

}

 interface Circle {
	
}
