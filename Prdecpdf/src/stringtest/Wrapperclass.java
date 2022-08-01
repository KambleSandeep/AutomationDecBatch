package stringtest;

public class Wrapperclass {
	public static void main(String[] args) {
		
		String rollno="1532155";
		
		float value = Float.parseFloat(rollno);
		System.out.println(value);
		

		int value1 = Integer.parseInt(rollno);
		System.out.println(value1);
		
		double value2 = Double.parseDouble(rollno);
		System.out.println(value2);
		
		boolean value3 = Boolean.parseBoolean(rollno);
		System.out.println(value3);
		
		
		int a=25252;
		String Mobno = Integer.toString(a);
		System.out.println(Mobno);
		
	
		
		
	}
	
	
}
