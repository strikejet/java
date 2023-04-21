package com.sunbeaminfo.tester;

class Employee implements Cloneable{
	int empid;
	String name;
	private double salary;
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void setSalary(double salary)throws Exception { // method is now throwing the exception to the calling method
		if(salary<1000)
				throw new Exception(); // new Exception is generated
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class Tester {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Employee e1 = new Employee(1, "e1", 1000);
		System.out.println("e1 = "+e1);
		
		Employee e2 = (Employee)e1.clone();
		System.out.println("e2 = "+e2);
		
		try {
			e2.setSalary(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After change in e2 -> ");
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		
		System.out.println("Thankyou for using our application");
		
		
	}
	
	
}
