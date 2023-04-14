
class Employee{
	int empid;
	String name;
	double salary;
	
	Employee(){
		this.name = "";
		this.salary = 200;
	}
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	Employee(int empid,String name, double salary){
		this.empid = empid;
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

		Employee e1 = new Employee(); // parameterless Ctor
		e1.dispalyEmployee();
		
		Employee e2 = new Employee(2,"rohan",1000); // Parameterized ctor
		e2.dispalyEmployee();
	
		Employee e3 = new Employee("rohan",1000);// parameterized ctor
		e3.dispalyEmployee();
		
	}

}
