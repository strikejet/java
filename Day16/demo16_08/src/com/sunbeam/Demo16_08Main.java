package com.sunbeam;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo16_08Main {
	public static final String DEPT_FILE = "/home/nilesh/mar-23/dac/java/Day16/dept.csv";
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream(DEPT_FILE)) {
			try(Scanner sc = new Scanner(fin)) {
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					//System.out.println(line);
					String[] parts = line.split(",");
					int deptno = Integer.parseInt(parts[0]);
					String dname = parts[1];
					String loc = parts[2];
					// assignment: create Dept object, and initialize it, and add into list
					System.out.println(deptno + ", " + dname + ", " + loc);
				}
			} // sc.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// assignment: display the list
	}
}
