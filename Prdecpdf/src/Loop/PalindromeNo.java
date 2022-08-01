package Loop;

public class PalindromeNo	 {
	public static void main(String[] args) {

		int num = 784521;
		
		int givenNum=num;
		int sum = 0;

		int rem = 0;

		while (num > 0) {

			rem = num % 10; // 6
			
			sum=(sum*10)+rem;
			
			num=num/10;
			
		}
		
		System.out.println(sum);
		
		if (sum==num)
			System.out.println("not Palindrome number");
		else
			System.out.println("Palindrome number");
		}	
	}


		