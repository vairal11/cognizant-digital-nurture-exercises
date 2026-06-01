package com.cognizant.ex26;

class MyThread extends Thread {

	private String message;

	public MyThread(String message) {
		this.message = message;

	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(message + " - " + i);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread thread1 = new MyThread("Thread 1 Running!");
		MyThread thread2 = new MyThread("Thread 2 Running!");

		thread1.start();
		thread2.start();
	}

}
