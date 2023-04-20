package com.sunbeaminfo.entities;

import java.util.Scanner;

public class Point implements Serviceable {
	private int x;
	private int y;
	
	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x = ");
		this.x = sc.nextInt();
		
		System.out.print("Enter y = ");
		this.y = sc.nextInt();
	}
	@Override
	public void printData() {
		System.out.println("Point = ("+this.x+","+this.y+")");
		
	}
}
