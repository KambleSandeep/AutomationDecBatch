package Loop;

public class Prim {
	public static void main(String[] args) {
		int a = 11;boolean 
		temp = true;

		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				System.out.println("No is not prime number");
				temp = false;
				break;

			}
		}
		if (temp == true) {
			System.out.println("no is prime number");
		}

	}

}
