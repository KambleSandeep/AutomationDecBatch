package Intrpckge;

public class MissingNumber {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,6};
		
		int n = a.length+1;
		
		int Total_sum = (n*(n+1))  / 2 ;
		
		int sum=0;
		
		for (int i=0; i < a.length; i++) 
			
			sum =sum + a[i];
			
			System.out.println("The missing number ="+(Total_sum-sum));
		}
		
	}
