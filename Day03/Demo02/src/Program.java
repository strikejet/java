import java.util.Scanner;

class Complex{
	//fields
	int real;
	int imag;
	
	//method
	void acceptComplex() { // reference(this)
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real = ");
		this.real = sc.nextInt();
		System.out.print("Enter imag = ");
		this.imag = sc.nextInt();
	}
	
	//method
	void displayComplex()
	{
		System.out.println("Real = "+this.real);
		System.out.println("Imag = "+this.imag);
	}
}


public class Program {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		
		c2.acceptComplex(); // 10,20
		c1.acceptComplex(); // 30,40
		
		c1.displayComplex(); // 30,40
		c2.displayComplex(); // 10,20
		
		
		
		
		
		
	}

}
