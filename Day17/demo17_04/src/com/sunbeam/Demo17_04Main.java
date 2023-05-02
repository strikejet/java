package com.sunbeam;

import java.util.Date;
import java.util.stream.Stream;

public class Demo17_04Main {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("Now: " + now.toString());
		
		Object ret1 = Middleware.callMethod("java.util.Date", "toString", null, null);
		System.out.println("Ret1 : " + ret1);
		
		Class<?> [] paramTypes2 = { Double.class, Double.class };
		Object[] params2 = { 2.2, 5.5 };
		Object ret2 = Middleware.callMethod("com.sunbeam.Arithmetic", 
									"sum",
									paramTypes2, 
									params2);	
		System.out.println("Ret2 : " + ret2);
		
		Class<?> [] paramTypes3 = { Integer.class, Integer.class };
		Object[] params3 = { 22, 55 };
		Object ret3 = Middleware.callMethod("com.sunbeam.Arithmetic", 
									"multiply", 
									paramTypes3, 
									params3);
		System.out.println("Ret3 : " + ret3);
		
		Stream<Integer> s = Stream.of(11, 22, 33, 44);
		Class<? extends Stream> c = s.getClass();
		System.out.println("Stream class: " + c.getName());
	}
}
