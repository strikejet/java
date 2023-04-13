
class Arithmetic{
	int num3;
	static int num4;
	
	static void add(int num1 ,int num2) {
		//this.num3 = 20; NOT OK
		num4 = 20; // OK
		System.out.println("Addition = "+(num1+num2));
	}
	
	static void add(int num1,int num2,int num3) {
		System.out.println("Addition = "+(num1+num2+num3));	
	}
	
	static void sub(int num1 ,int num2) {
		System.out.println("Substraction = "+(num1-num2));
	}
	
	static void multiplication(int num1 ,int num2, int num3, int num4) {
		System.out.println("Multiplication = "+(num1*num2*num3*num4));
	}
	
}



public class Program {
	
	static void div(int num1,int num2) {
		System.out.println("Division = "+(num1/num2));
	}
	
	public static void main(String[] args) {
		Arithmetic.add(10, 20);
		Arithmetic.add(10, 20, 30);
		Arithmetic.sub(60, 20);
		
		Arithmetic a1 = new Arithmetic();
		a1.add(10, 20);
		
		div(20,2);
	}

}
