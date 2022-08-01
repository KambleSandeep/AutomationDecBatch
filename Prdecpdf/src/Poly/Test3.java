package Poly;

public class Test3 {
	Test3(){
		System.out.println("Non-parameterzed constructor");
	}
   Test3(int a)
   {
	   
System.out.println("parameterrized constructor");
   }
   Test3(int a, int b){
	   System.out.println("constructor with two parameter");
   }
   
   public static void main(String[] args) {
	Test3 t=new Test3(5648);
}
}
