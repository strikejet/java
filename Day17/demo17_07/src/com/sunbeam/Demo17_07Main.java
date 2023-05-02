package com.sunbeam;

public class Demo17_07Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyThread: " + i);
					delay(1000);
				}	
			}
		}
		Thread th1 = new MyThread();
		th1.start();
		
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("MyRunnable: " + i);
					delay(1000);
				}					
			}
		}
		Runnable mr = new MyRunnable();
		Thread th2 = new Thread(mr);
		th2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main: " + i);
			delay(1000);
		}
	}
}
