package com.sunbeaminfo.entity;

import java.util.Objects;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	
	@Override
	public boolean equals(Object obj)//upcasting
	{
		if(obj!=null) {
			Employee other = (Employee)obj; // downcasting
			if(this.empid==other.empid && this.name.equals(other.name)&& this.salary==other.salary)
				return true;
		}
		return false;
	}
	
	
	
	
}
