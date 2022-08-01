package blocks;

public class Sample2 {
	{
		System.out.println("Thid is non static Block");
	}
	
	static 
	{
		System.out.println("this is the static block");
	}
	Sample2(){
		System.out.println("This is the cunstructor");
	}
	
	public static void main(String[] args) {
		System.out.println("this is the main method");
		Sample2 s=new Sample2();
	}
	
	
	
}
