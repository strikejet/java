package com.sunbeam;

import java.util.Scanner;

public class Demo18_01Main {
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
					System.out.println("Thread: " + i);
					delay(1000);
				}
			}
		}
		Thread th = new MyThread();
		System.out.println("Initial State: " + th.getState());
		th.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press enter to stop the thread...");
		sc.nextLine();
		
		System.out.println("State before stop: " + th.getState());
		th.stop();		
		delay(100);
		System.out.println("State after stop: " + th.getState());
		
		System.out.println("Main ends...");
	}

}
