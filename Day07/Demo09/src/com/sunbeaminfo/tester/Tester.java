package com.sunbeaminfo.tester;

import java.util.Scanner;

import com.sunbeaminfo.entities.Circle;
import com.sunbeaminfo.entities.Rectangle;
import com.sunbeaminfo.entities.Shape;
import com.sunbeaminfo.entities.Square;

public class Tester {

	public static int menu() {
		System.out.println("----------------------");
		System.out.println("0. Exit");
		System.out.println("1. Area of Rectangle");
		System.out.println("2. Area of Circle");
		System.out.println("3. Area of Square");
		System.out.print("Enter choice = ");	
		return new Scanner(System.in).nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		Shape shape = null;
		while((choice=Tester.menu())!=0) {
			switch (choice) {
			case 1:
				shape = new Rectangle(); // upcasting
				break;
			case 2:
				shape = new Circle();
				break;
			case 3:
				shape = new Square();
				break;
			default:
				System.out.println("Wrong choice..:(");
				break;
			}
			if(shape !=null) {
				shape.acceptData();
				shape.calculateArea();
				shape.displayArea();
				shape = null;
			}
		}
	}

}
