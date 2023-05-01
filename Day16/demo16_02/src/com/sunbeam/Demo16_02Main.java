package com.sunbeam;

import java.io.File;
import java.util.Scanner;

// input a path from user
// if path is invalid, give error and exit.
// if path is of directory, display its contents.
// if path is of file, display its information.

public class Demo16_02Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a path: ");
		String path = sc.nextLine();
		File f = new File(path);
		
		if(!f.exists()) {
			System.out.println("Invalid Path");
			System.exit(1);
		}
		
		if(f.isDirectory()) {
			System.out.println("Directory Listing...");
			String[] entries = f.list();
			for (String entry : entries) {
				System.out.println(entry);
			}
		}
		else if(f.isFile()) {
			System.out.println("File Name: " + f.getName());
			System.out.println("Directory: " + f.getParent());
			System.out.println("File Size: " + f.length());
			String mode = (f.canRead() ? "r" : "-")
							+ (f.canWrite() ? "w" : "-")
							+ (f.canExecute() ? "x" : "-");
			System.out.println("File Mode: " + mode);
		}
		else
			System.out.println("Neither file nor directory");
	}
}










