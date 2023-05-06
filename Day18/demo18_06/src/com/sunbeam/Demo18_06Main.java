package com.sunbeam;

public class Demo18_06Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Object obj = new Object(); // object for locking/synchronization
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				synchronized(obj) {
					String str = "SUNBEAM\n";
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(1000);
					}
					obj.notify(); //obj.notifyAll();
				}
				// additional task
			}
		}
		class InfotechThread extends Thread {
			@Override
			public void run() {
				synchronized(obj) {
					try {
						obj.wait(); 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					String str = "INFOTECH\n";
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(1000);
					}
				}
				// additional task
			}
		}

		Thread st = new SunbeamThread();
		Thread it = new InfotechThread();
		
		it.start();
		st.start();

	}
}







