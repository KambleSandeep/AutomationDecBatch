package Intrpckge;

public class Onetohundrwtht {

	static void printNos(int n) {
		
		if (n>0) {
		
			printNos(n-1);
			System.out.println(n+" ");
			
	}
	
		return;
	}
	
	public static void main(String[] args) {
		{
			
			printNos(100);
			
		} 
	}
	
}
