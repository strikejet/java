package com.sunbeaminfo.entity;

import java.util.Scanner;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(1,1);
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void displayPoint() {
		System.out.println("Point = ("+this.x+","+this.y+")");
	}
	
	public void acceptPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x = ");
		this.x = sc.nextInt();
		System.out.print("Enter y = ");
		this.y = sc.nextInt();
	}

}
