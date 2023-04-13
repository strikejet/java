import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int choice;

		do {
		System.out.println("0. EXIT");
		System.out.println("1. Poha");
		System.out.println("2. Vada");
		System.out.println("3. Idli");
		System.out.print("Enter your choice = ");

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		switch (choice) {
		case 0:
			System.out.println("Visit Again");
			break;
		case 1:
			System.out.println("Poha");
			break;
		case 2:
			System.out.println("Vada");
			break;
		case 3:
			System.out.println("Idli");
			break;
		default :
			System.out.println("Wrong choice entered");
			break;
		}
	}while(choice!=0);
	}

}
