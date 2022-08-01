package constructor;

public class Test2 {
static int a;
static int b;
	
Test2(){
	a=10;
	b=20;
	String str="xyz";
	
}	
Test2(int x){
	Test2 t=new Test2();
	a=10;
	b=20;
	String str="xyz";

}

public void m1() {
}

public static void main(String[] args) {
	Test2 t=new Test2();
	System.out.println(t.a);
	System.out.println(t.b);
}






}







