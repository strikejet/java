package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Circle;
import com.sunbeaminfo.entities.Rectangle;
import com.sunbeaminfo.entities.Shape;

public class Tester {

	public static void main(String[] args) {
		Shape shape; // Interface
		System.out.println(Shape.num1);
		shape = new Rectangle();
		shape.acceptData();
		shape.calculateArea();
		
		
		shape = new Circle();
		shape.acceptData();
		shape.calculateArea();
	}

}
