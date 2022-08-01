package constructor;

public class Sample1 {
	String name;
	int mobNo;
	
    Sample1() {

name="Tester";
mobNo=95033;



}







Sample1(String str, int a ){
	name=str;
	mobNo= a;
}
	public static void main(String[] args) {
		Sample1 s=new Sample1();
System.out.println(s.name);		System.out.println(s.mobNo);

	Sample1 s1=new Sample1 ("test1215",54846);
	

	
System.out.println(s1.name);
System.out.println(s1.mobNo);
	
	}
	
}

