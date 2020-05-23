package com.akshay.pracrtice.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		System.out.println("Main method starts");
		MyThread thread = new MyThread();
		thread.start();
		
		System.out.println("Main method ends");
	}

}
