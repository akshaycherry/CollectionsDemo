package com.akshay.practice.itf;

public class TestAnonymous {
public static void main(String args[]) {
	AnonymousClass ac=new AnonymousClass() {
		public void drive() {
			System.out.println("This is anonymous class drive method");
		}
	};
	ac.drive();
}
}
