package stringpractice;

public class Pldrm {
	public static void main(String[] args) {
		int num=75257;
		int rem=0;
		int sum=0;
		int temp=num;
		
		while (num>0) {
			rem=num%10;  //3
			
			sum = (sum*10)+rem;
			num= num/10;
			
		}  
		
		if(sum==temp) {
			System.out.println( sum + "this is polindrom no");
		}
		else
		{
			System.out.println( sum  + "this is not polindrom no");
		}
	}

}
