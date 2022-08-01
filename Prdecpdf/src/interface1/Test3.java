package interface1;

public class Test3 implements Test {
	public void m1() {
		System.out.println("Test method -1");
	}
public void m2() {
	System.out.println("test Method -2");
}
public static void main(String[] args) {
	Test3 s=new Test3();
	s.m1();
	s.m2();
}
}
