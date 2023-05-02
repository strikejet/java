package com.sunbeam;

public class Demo17_06Main {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();
		String[] cmd = { "/usr/bin/firefox", "google.com" };
		System.out.println("Launching firefox ...");
		Process process = rt.exec(cmd); // syscalls -- fork() + exec()
		int status = process.waitFor(); // syscalls -- wait()
		System.out.println("Exit status: " + status);
	}
}
