package com.sunbeam;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Demo17_05Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Class Annotations: ");
		Annotation[] anns = MyClass.class.getDeclaredAnnotations();
		for (Annotation ann : anns) {
			System.out.println(ann);
		}
		
		Developer an = MyClass.class.getDeclaredAnnotation(Developer.class);
		System.out.println("Name : " + an.value());
		System.out.println("Company : " + an.company());
		
		System.out.println("field1 Annotations: ");
		Field field = MyClass.class.getDeclaredField("field1");
		anns = field.getDeclaredAnnotations();
		for (Annotation ann : anns) {
			System.out.println(ann);
		}
	}
}
