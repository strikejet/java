package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo16_03Main {
	public static void main(String[] args) {
		int b;
		// input a source file path
		String sourcePath = "/home/nilesh/mar-23/dac/java/Day15/day15.pdf";
		// input a destination file path
		String destPath = "/home/nilesh/test.pdf";
		// create FileInputStream to read from source file
		try(FileInputStream in = new FileInputStream(sourcePath)) {
			// create FileOutputStream to write into destination file
			try(FileOutputStream out = new FileOutputStream(destPath)) {
				// read a byte from source file
				while( (b = in.read()) != -1 ) {
					// write that byte into destination file
					out.write(b);
				} // repeat above two steps until end of source file
				System.out.println("File copied.");
				// close the destination file
			} //out.close();
			// close the source file
		} //in.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
