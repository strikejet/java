
public class Program {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77 };
		
		for (int i = 0; i < 7; i++) {
			if(arr[i]%2!=0) // If the number is odd
				continue; // continue with the next iteration
			
			System.out.println(arr[i]);
		}
		
	}
	
	public static void main1(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55, 66, 77 };
		
		int key = 44;
		
		for(int i = 0; i<7; i++)
		{
			if(arr[i]==key) {
				System.out.println("Key found");
				break;
			}
			System.out.println(i);
		}

	}

}
