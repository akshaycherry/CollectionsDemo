package com.akshay.pracrtice.thread;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		Counter counter = new Counter();
		counter.count();

	}

}
