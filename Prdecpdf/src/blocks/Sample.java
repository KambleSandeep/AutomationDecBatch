package blocks;

public class Sample {
	{
		
		System.out.println("this is the non static block");
		
	}

static
{
System.out.println("This is static Block");
for(int a=0; a<=10; a++) {
	System.out.println("For loop running");
}

}

public static void main(String[] args) {
	System.out.println("this is main method ");
   Sample s=new Sample();



}	

}



