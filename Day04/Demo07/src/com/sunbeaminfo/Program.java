package com.sunbeaminfo;

class Singleton {
	private static int count;

	// step4 -> Declare the reference of the class as field of the class
	// step5 -> make the reference as static
	private static Singleton reference_singleton = null;

	static {
		count = 0;
	}

	// step1 -> Make ctor private
	private Singleton() {
		System.out.println("Inside Ctor");
		count++;
	}

	void displayObjcetCount() {
		System.out.println("Count = " + count);
	}

	// Step2 -> Write a getter for returning an instance
	// step3 -> make the method as static
	static Singleton getSingletonInstance() {
		//step6-> check for the condition if your ref is null or not
		// if ref is null create the instance and then return
		// if ref is not null then return it as it is.
		
		if (reference_singleton == null)
			reference_singleton = new Singleton();

		return reference_singleton;
	}
}

public class Program {
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingletonInstance();
		Singleton s2 = Singleton.getSingletonInstance();
		Singleton s3 = Singleton.getSingletonInstance();
		Singleton s4 = Singleton.getSingletonInstance();
		Singleton s5 = Singleton.getSingletonInstance();
		Singleton s6 = Singleton.getSingletonInstance();
		Singleton s7 = Singleton.getSingletonInstance();
		Singleton s8 = Singleton.getSingletonInstance();
		Singleton s9 = Singleton.getSingletonInstance();
		Singleton s10 = Singleton.getSingletonInstance();
		Singleton s11 = Singleton.getSingletonInstance();

		s10.displayObjcetCount();

	}

}
