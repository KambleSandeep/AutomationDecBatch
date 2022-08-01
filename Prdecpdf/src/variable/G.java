package variable;

public class G {
 int  num=500;
 
 
 public void m1() {
int num=700;
System.out.println(num);
System.out.println(this.num);
	
 }
 
public static void main(String[] args) {
G abc =new G();
abc.m1();




}
	
	
	
}
