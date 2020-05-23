package com.akshay.practice.abs;

public class TestAnonymous {

	public static void main(String[] args) {
		AnonymousClass ac=new AnonymousClass() {
			void eat() {
				System.out.println("This is Anonymous class eat method");
			}
		};
		ac.eat();  
	}
}

