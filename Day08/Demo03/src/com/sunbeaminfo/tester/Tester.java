package com.sunbeaminfo.tester;

import com.sunbeaminfo.entities.Complex;
import com.sunbeaminfo.entities.Date;
import com.sunbeaminfo.entities.Point;
import com.sunbeaminfo.entities.Serviceable;


public class Tester {

	public static void main(String[] args) {
		Serviceable s;
		
		s = new Date(); // upcasting
		s.acceptData();
		s.printData();
		
		s = new Complex();
		s.acceptData();
		s.printData();
		
		s = new Point();
		s.acceptData();
		s.printData();
	
	}

}
