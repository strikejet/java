package com.sunbeaminfo.tester;

import com.sunbeaminfo.entity.Employee;
import com.sunbeaminfo.exceptions.BlankEmpNameException;
import com.sunbeaminfo.exceptions.LessSalaryException;

public class Tester {

	public static void main(String[] args) {
		try {
			Employee e1 = new Employee(1, "e1", 2000);
			System.out.println(e1);
		} 
		catch (LessSalaryException e) {
			e.printStackTrace();
		}
		catch(BlankEmpNameException e) {
			System.err.println("Name provided is not correct");
		}
		
		System.out.println("Thank you");
	}

}
