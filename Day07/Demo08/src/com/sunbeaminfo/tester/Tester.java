package com.sunbeaminfo.tester;

import java.util.Scanner;

import com.sunbeaminfo.entities.Employee;
import com.sunbeaminfo.entities.Person;
import com.sunbeaminfo.entities.Student;

public class Tester {

	private static void addPersons(Person parr[]) {
		// upcasting
		parr[0] = new Employee("e1", "a1", 1, 1000);
		parr[1] = new Employee("e2", "a2", 2, 2000);
		parr[2] = new Student("s1", "a1", 1, 60);
		parr[3] = new Employee("e3", "a3", 3, 3000);
		parr[4] = new Student("s2", "a2", 2, 70);
		parr[5] = new Employee("e4", "a4", 4, 4000);
		parr[6] = new Employee("e5", "a5", 5, 5000);
		parr[7] = new Student("s3", "a3", 3, 80);
		parr[8] = new Employee("e6", "a6", 6, 6000);
		parr[9] = new Student("s4", "a4", 4, 90);

	}

	public static int menu() {
		System.out.println("0. EXIT");
		//todo -> menu fror adding student & employee
		System.out.println("1. Dispaly All Records");
		System.out.println("2. Display Only Employees");
		System.out.println("3. Display Only Students");
		System.out.println("4. Give Increment");
		System.out.println("5. Give Grace Percentage");
		System.out.print("Enter choice = ");
		return new Scanner(System.in).nextInt();
	}

	public static void main(String[] args) {
		Person parr[] = new Person[10];
		Tester.addPersons(parr);
		int choice;
		while ((choice = Tester.menu()) != 0) {
			switch (choice) {
			case 1:
				System.out.println("-------------------------");
				System.out.println("List of Persons ->");
				for (Person person : parr) {
						person.displayData();
						System.out.println("-------------------------");
				}
				break;
			case 2:
				System.out.println("-------------------------");
				System.out.println("List of Employees ->");
				for(Person person : parr)
					if(person instanceof Employee) {
						person.displayData();
						System.out.println("-------------------------");
					}
					
				break;

			case 3:
				System.out.println("-------------------------");
				System.out.println("List of Students ->");
				for(Person person : parr)
					if(person instanceof Student) {
						person.displayData();
						System.out.println("-------------------------");
					}
				break;

			case 4:
				System.out.println("-------------------------");
				System.out.print("Enter empid = ");
				int empid = new Scanner(System.in).nextInt();
				for (Person person : parr) {
					if(person instanceof Employee)
					{
						Employee e =(Employee) person;
						if(empid == e.getEmpid())
							e.increment();
					}
				}
				break;

			case 5:
				System.out.println("-------------------------");
				System.out.print("Enter Rollno = ");
				int rollno = new Scanner(System.in).nextInt();
				for (Person person : parr) {
					if(person instanceof Student) {
						Student s = (Student)person;
							if(rollno == s.getRollno())
								s.gracePercentage();
					}
				}		
				break;

			default:
				System.out.println("Wrong Choice entered..:(");
				break;
			}
		}
		
		System.out.println("Thank You for using our App..:)");
	}

}
