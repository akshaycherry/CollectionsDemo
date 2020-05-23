package com.akshay.pracrtice.thread;

import java.util.Scanner;

public class MyThread extends Thread {
	
	public void run() {
		for(int i=1; i<=2;i++) {
			System.out.println("Number =" + i);
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			System.out.println("input is :" + input);
			
		}
		
		
	}

}
