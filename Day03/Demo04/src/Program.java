
class Complex{
	//fields
	int real;
	int imag;
	
	
	Complex(){
		System.out.println("Inside Paramterless Constructor");
		this.real = 10;
		this.imag = 20;
	}
	
	Complex(int real,int imag){
		System.out.println("Inside Parameterized Constructor");
		this.real = real;
		this.imag = imag;
	}
	

	void displayComplex()
	{
		System.out.println("Real = "+this.real);
		System.out.println("Imag = "+this.imag);
	}
}


public class Program {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex(40,50);
		
		c1.displayComplex(); // 10,20
		c2.displayComplex(); //40,50
		
		
		
		
	}

}
