package com.sunbeam;

import java.lang.reflect.Method;

public class Middleware {
	public static Object callMethod(String className, // method to be called of which class?
								String methodName, // which method to be called?
								Class<?>[] paramTypes, // what are param types of the method?
									Object[] args) // actual method args
	{
		try {
			// load the class
			Class<?> c = Class.forName(className);
			// dynamically create object of the class (using param less constructor)
			Object obj = c.newInstance();
			// find the given method with given parameterTypes
			Method m = c.getDeclaredMethod(methodName, paramTypes);
			// make method accessible
			m.setAccessible(true);
			// execute the method on created object and collect result
			Object res = m.invoke(obj, args);	//obj.methodName(args)
			// return result
			return res;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
