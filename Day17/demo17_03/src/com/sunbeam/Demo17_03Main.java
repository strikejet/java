package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Demo17_03Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a class name: ");
		String className = sc.nextLine();
		
		Class<?> c = Class.forName(className);
		
		System.out.println("Class Name: " + c.getName());
		
		Class<?> superCls = c.getSuperclass();
		if(superCls != null)
			System.out.println("Super Class Name: " + superCls.getName());
		
		Class<?>[] intfClses = c.getInterfaces();
		for (Class<?> intfCls : intfClses) {
			System.out.println("Super Interface: " + intfCls.getName());
		}
		
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Field: " + field.toString());
		}
		
		Method[] methods = c.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("Method: " + method.toString());
		}
		
		Constructor<?>[] ctors = c.getDeclaredConstructors();
		for (Constructor<?> ctor : ctors) {
			System.out.println("Constructor: " + ctor.toString());
		}
		
		Annotation[] anns = c.getDeclaredAnnotations();
		for (Annotation ann : anns) {
			System.out.println("Annotations: " + ann);
		}
	}
}




