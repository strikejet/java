package com.sunbeam;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class Demo16_09Main {
	public static void main(String[] args) {
		int ch;
		String srcPath = "/home/nilesh/mar-23/dac/java/Day16/dept.csv";
		String destPath = "/home/nilesh/test.csv";
		/*
		// Java 1.8
		try(FileReader fr = new FileReader(srcPath)) {
			try(FileWriter fw = new FileWriter(destPath)) {
				while( (ch = fr.read()) != -1 )
					fw.write(ch);
				System.out.println("File copied.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		// Java 11 code
		try(FileReader fr = new FileReader(srcPath)) {
			try(FileWriter fw = new FileWriter(destPath, Charset.forName("UTF-16"))) {
				while( (ch = fr.read()) != -1 )
					fw.write(ch);
				System.out.println("File copied.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
