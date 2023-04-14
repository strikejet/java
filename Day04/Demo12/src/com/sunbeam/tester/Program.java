package com.sunbeam.tester;

import com.sunbeaminfo.entity.Point;

public class Program {

	public static void main(String[] args) {
			
	Point [] pointArr = new Point[5];
	
	for(int i = 0;i<pointArr.length;i++) {
		pointArr[i] = new Point();
		System.out.println("For index "+i);
		pointArr[i].acceptPoint();
	}
	
	
	for(Point ref:pointArr) 
		ref.displayPoint();
	}

}
