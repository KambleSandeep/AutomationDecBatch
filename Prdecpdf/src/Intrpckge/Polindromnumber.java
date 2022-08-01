package Intrpckge;

public class Polindromnumber {
	
public static void main(String[] args) {
	
	int num=3663;
	int rem=0;
	int sum=0;
	int temp=num;
	
	while (num>0) {
		rem = num%10;
		sum = (sum*10)+rem;
		num = num/10;
	}
	
	
	if(sum==temp) {
		
System.out.println("this is polidrom number="+ sum);	}
		
	else {
		
		System.out.println("this is not polidrom number"+ sum);
		
	}
	

	
}

}
