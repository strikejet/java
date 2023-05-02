package com.sunbeam;

public class Demo17_09Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		class MyThread extends Thread {
			private int max;
			public MyThread(int max) {
				this.max = max;
			}
			@Override
			public void run() {
				Thread th = Thread.currentThread();
				for (int i = 1; i <= max; i++) {
					System.out.println(th.getName() + " : "+ i);
					delay(1000);
				}	
			}
		}
		Thread th1 = new MyThread(15);
		th1.setName("Thread1");
		th1.setDaemon(true);
		th1.start();

		Thread th2 = new MyThread(8);
		th2.setName("Thread2");
		th2.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main :" + i);
			delay(1000);
		}
	}
}
