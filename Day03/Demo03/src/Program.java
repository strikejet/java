import java.util.Scanner;

class Complex{
	//fields
	int real;
	int imag;
	
	Complex(){
		System.out.println("Inside ctor");
		this.real = 10;
		this.imag = 20;
	}
	
	
	void initComplex() {
		this.real = 10;
		this.imag = 20;
	}
	
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
		//c1.initComplex();
		c1.displayComplex();
		
		Complex c2 = new Complex();
		//c2.initComplex();
		c2.displayComplex();
		
		
		
	}

}
