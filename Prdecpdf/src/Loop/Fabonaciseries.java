package Loop;

public class Fabonaciseries {
public static void main(String[] args) {
	int a=0; 	int b=1;

	int count = a;
	System.out.println(a);
	
	System.out.println(b);
	for (int i=0; i<=10; i++)
	{
		count=a+b;
		
		System.out.println(count);
		a=b;
		b=count;
	}
}
}
