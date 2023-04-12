// Pascal case naming convention
public class Program {

	public static void main(String[] args) {
		
		byte num1 = 10; // camel case naming convention
		short num2 = 20;
		int num3 = 30;
		long num4 = 9999999999;
		float num5 = 9999999999f;
		double num6 = 60;
		char ch = 'A';
		boolean status = true;
		
		// double = float
		num6 = num5;
		num6 = num3; // widening
		
		//int = double
		num3 =(int) num6; // narrowing
		
		//boolean = int // NOT allowed
		//status = (boolean)num3; // NOT OK	
		
		//float = long
		num5 = num4; // Widening
				
		// long = float
		num4 = (long)num5; // Narrowing
	}

}
