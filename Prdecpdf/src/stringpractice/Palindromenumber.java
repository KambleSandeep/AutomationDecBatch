package stringpractice;

public class Palindromenumber {
public static void main(String[] args) {
	int rem;
	int rev_num=0;
	int temp;
	int n=3663;
	
	temp=n;
	
	while (n!=0)
	{
		rem=n%10;    // getting remainder
		rev_num=(rev_num*10)+rem;
		n=n/10;
	}
	if(temp==rev_num)
		System.out.println(temp+"this is Palindrom number");
	else
		System.out.println(temp+"this is not Polindrome number");
	}
	
}
