package com.sunbeam;

import java.util.Scanner;

public class Demo18_02Main {

	public static void main(String[] args) {
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Thread: " + i);
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						System.out.println("Wake up forcibly...");
					}
				}
			}
		}
		Thread th = new MyThread();
		th.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Press enter to interrupt the thread...");
		sc.nextLine();
		
		th.interrupt();		
		
		System.out.println("Main ends...");
	}

}


