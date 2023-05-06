package com.sunbeam;

public class Demo18_07Main {
	public static void main(String[] args) {
		//MyService s = new MyService();
		
		// do while -- menu driven -- System.exit()
		
		Runtime rt = Runtime.getRuntime();
		rt.addShutdownHook(new Thread() {
			@Override
			public void run() {
				//s.close();
			}
		});
	}
}
