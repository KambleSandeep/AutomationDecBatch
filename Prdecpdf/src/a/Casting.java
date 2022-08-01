package a;

public class Casting {
public static void main(String[] args) {
	double a=25.5;  // 8 byte
	System.out.println(a);
	
	int b=(int)a;
	System.out.println(b);
	
	
	short x=100;
	long y=x;
	System.out.println(y);

	long m=500;
	short n=(short)m;
	System.out.println(n);
}
}
