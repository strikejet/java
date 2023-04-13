
class Employee{
	int empid;
	String name;
	double salary;
	
	static int generate_empid;
	
	//static initializer block
	static {
		generate_empid = 1000;
	}

	 Employee() {
		this("",200);
	}
	
	Employee(String name, double salary) {
		this.empid = ++generate_empid;
		this.name = name;
		this.salary = salary;
	}
	
	void dispalyEmployee() {
		System.out.println("Empid = "+this.empid);
		System.out.println("Name = "+this.name);
		System.out.println("Salary = "+this.salary);
	}
	

}


public class Program {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee("rohan",1000);
		//Employee e3 = new Employee(2,"nilesh",2000);
		
		e1.dispalyEmployee();
		e2.dispalyEmployee();
		e3.dispalyEmployee();
		e4.dispalyEmployee();
		
	}

}
