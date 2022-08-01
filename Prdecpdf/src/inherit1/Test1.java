
package inherit1;

public class Test1 extends Test2 {
int a=10;

public void m1() {
	int a=20;
	System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
	
		
}

