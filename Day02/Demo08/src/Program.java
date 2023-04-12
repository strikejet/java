import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int empid;
		String name;
		double salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter empid = ");
		empid = sc.nextInt();
				
		System.out.println("Enter Name = ");
		name = sc.next();
		
		System.out.println("Enter Salary = ");
		salary = sc.nextDouble();
		
		
		System.out.println("Empid = "+empid);
		System.out.println("Name = "+name);
		System.out.println("Salary = "+salary);
	}


}
