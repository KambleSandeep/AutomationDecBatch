package constructor;

public class Test1 {
	int rno;
	String name;
	
	
	Test1(){
		rno=26;
		name="Ramesh";	
		
	}
	
	
	Test1(String str,int a){
		rno=a;
		name=str;
		
	}
	
	public void m1() {
		System.out.println(rno);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Test1 tt=new Test1();
		tt.m1();
	
	Test1 t1=new Test1("Dinesh",75);
	t1.m1();
	
	Test1 t2=new Test1("laadu",75);
	t2.m1();


	}
	
	
	
}
