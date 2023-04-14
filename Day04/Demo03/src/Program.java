
class Employee {
	int empid;
	String name;
	double salary;
	static int auto_increment_empid;

	// static initializer block
	static {
		auto_increment_empid = 1000;
	}

//	Employee(){
//		this.empid = ++auto_increment_empid;
//		this.name = "";
//		this.salary = 200;
//	}

	Employee() {
		this("", 200);
	}

	Employee(String name, double salary) {
		this.empid = ++auto_increment_empid;
		this.name = name;
		this.salary = salary;
	}

	void dispalyEmployee() {
		System.out.println("Empid = " + this.empid);
		System.out.println("Name = " + this.name);
		System.out.println("Salary = " + this.salary);
	}

}

public class Program {

	public static void main(String[] args) {

		Employee e1 = new Employee();//
		Employee e2 = new Employee();//
		Employee e3 = new Employee("rohan", 1000);//
		e1.dispalyEmployee();
		e2.dispalyEmployee();
		e3.dispalyEmployee();

	}

}
