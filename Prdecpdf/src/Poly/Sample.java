package Poly;

public class Sample {
public void add(int a, int b) {
	int c=a+b;
	System.out.println("Addition of Two numbers"+c);
}	

public void add(int x, int y, int z) {
	int sum = x+y+z;
	System.out.println("addition of three"+sum);
	
}


public static void main(String[] args) {
		Sample t=new Sample();
        t.add(68, 34,27);
        t.add(20, 56);



}	
}
