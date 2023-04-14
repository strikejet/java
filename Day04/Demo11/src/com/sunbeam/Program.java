package com.sunbeam;

import java.util.Scanner;

class Point{
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

public class Program {

	public static void main(String[] args) {
		
	Point[] pointArr = new Point[5];
	
	pointArr[0] = new Point();
	pointArr[1] = new Point(2,4);
	pointArr[2] = new Point();
	pointArr[2].acceptPoint();
	
	pointArr[3] = new Point(3,6);
	pointArr[4] = new Point(2,5);
		
		
	pointArr[0].displayPoint();
	pointArr[1].displayPoint();
	pointArr[2].displayPoint();
	pointArr[3].displayPoint();
	pointArr[4].displayPoint();
	
		
		
		
	}

}
