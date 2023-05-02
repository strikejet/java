package com.sunbeam;

public class Demo17_08Main {
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
				Thread th = Thread.currentThread();
				for (int i = 1; i <= 10; i++) {
					System.out.println("Id=" + th.getId() + ", Name=" + th.getName() + " :" + i);
					delay(1000);
				}	
			}
		}
		Thread th1 = new MyThread();
		th1.setName("BeautifulThread");
		th1.start();

		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Id=" + th.getId() + ", Name=" + th.getName() + " :" + i);
			delay(1000);
		}
	}
}
