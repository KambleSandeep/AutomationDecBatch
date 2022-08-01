package Poly;

public class Sample1 {

	public void add(int a, float b) {
		float c = a + b;
		System.out.println("Addition of two numbers" + c);
	}


           public void add(){		
        	   System.out.println("Non paramarametrized");

	}

	public static void main(String[] args) {

		Sample1 s = new Sample1();
		s.add(25, 58.5f);
		s.add();
	}

}
