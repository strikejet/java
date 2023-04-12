
class Point{
	
	//fields of class
	int x;
	int y;

	//method
	void initPoint() {
		x = 1;
		y = 1;
	}

	void displayPoint() {
		System.out.println(x);
		System.out.println(y);
	}
	
}

//class Sunbeam{
//	int accno;
//	String cust_name;
//	double balance;
//	
//	void withdraw() {
//		
//	}
//	
//	void deposit() {
//		
//	}
//	
//	void displayAccountDetails() {
//		
//	}
//}


public class Program {

	public static void main(String[] args) {
		
		//Point p1; //Reference
		Point p1 = new Point(); // Object of the class -> instance of the class
		p1.initPoint();
		p1.displayPoint();
		
		//Sunbeam s = new Sunbeam();
	}

}
