
public class Program {

	public static void main(String[] args) {

		String str_num = "123"; // reference type
		int num ; // value type
		num = Integer.parseInt(str_num); // unboxing
		
		System.out.println(num+30);
		

	}

	public static void main1(String[] args) {

		int num = 10;// primitive type
		String str_num; // non-primitive type
		str_num = Integer.toString(num); // boxing
		//str_num = String.valueOf(num); // boxing

		System.out.println(str_num + 30);

	}

}
