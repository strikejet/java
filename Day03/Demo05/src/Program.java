
class Complex{
	//fields
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
	int num6;
	int num7;
	int num8;
	int num9;
	int num10;
	int num11;
	int num12;
	
	
	public Complex() {
//		this.num1 = 1;
//		this.num2 = 2;
//		this.num3 = 3;
//		this.num4 = 4;
//		this.num5 = 5;
//		this.num6 = 6;
//		this.num7 = 7;
//		this.num8 = 8;
//		this.num9 = 9;
//		this.num10 = 10;
//		this.num11 = 11;
//		this.num12 = 12;
		this(1,2,3,4,5,6,7,8,9,10,11,12);
	}
	
	Complex(int num1,int num12){
		this(num1,2,3,4,5,6,7,8,9,10,11,num12);
	}
	
	public Complex(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10,
			int num11, int num12) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
		this.num6 = num6;
		this.num7 = num7;
		this.num8 = num8;
		this.num9 = num9;
		this.num10 = num10;
		this.num11 = num11;
		this.num12 = num12;
	}
	
	
}


public class Program {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex(10,20);
		
		
		
		
	}

}
