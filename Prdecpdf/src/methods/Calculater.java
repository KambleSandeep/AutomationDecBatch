package methods;

public class Calculater {
    public void add() {

	int a= 25;
	int b= 50;

int result=a=b;
//usage
System.out.println("Addintion"+result);

}
 

  public  void substraction () {
	
int x=100;
int y=40;
int result=x-y;

System.out.println("substarction"+result);

}

public static void main(String[] args) {
	
	Calculater cal = new Calculater();

cal.add();
cal.substraction();

}





}