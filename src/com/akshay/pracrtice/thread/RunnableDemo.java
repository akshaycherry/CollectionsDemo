package com.akshay.pracrtice.thread;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("Main method Started");
		ThreadRunnable runnable = new ThreadRunnable();
		Thread t1 = new Thread(runnable);
		t1.start();
		
		System.out.println("Main method ends");

	}

}
