package Returntype;

public class sample {
	public float test1(float a, float b) {
	
		
		
float result=a+b;
	return result;
	}
 
 public static void main(String[] args) {
	sample ss=new sample();
	float value = ss.test1(56.5f,51.5f);
	System.out.println(value);
}
	
	
	
	
	
}
