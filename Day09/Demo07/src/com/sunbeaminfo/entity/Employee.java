package com.sunbeaminfo.entity;

import com.sunbeaminfo.exceptions.BlankEmpNameException;
import com.sunbeaminfo.exceptions.LessSalaryException;

public class Employee {
	private int empid;
	private String name;
	private double salary;

	public Employee(int empid, String name, double salary)throws LessSalaryException {
		this.empid = empid;
		if(name == null || name.equals(""))
			throw new BlankEmpNameException();
		this.name = name;
		if(salary<1000)
			throw new LessSalaryException("salary provided is less than 1000");
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
