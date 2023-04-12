
class Complex{
	int real;
	int imag;
	
	void initComplex(int r , int i) {
		real = r;
		imag = i;
	}
	
	void display() {
		System.out.println("Real = "+real);
		System.out.println("Imag = "+imag);
	}
}

public class Program {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.initComplex(10, 20);
		c1.display();
		
		Complex c2 = new Complex();
		c2.initComplex(30, 40);
		c2.display();
		
		Complex c3 = c2;
		c3.display();
	
		c2 = c1;
		
	}
	
	
	
	
	
	
	
	

}
