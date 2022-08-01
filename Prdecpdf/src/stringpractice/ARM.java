package stringpractice;

public class ARM {
	public static void main(String[] args) {
		//Armstrong Number eg. 153=1+125+27
		//3 =27+, 5=125 , 
		// 132= 1+27+8, 132!=36 not armSrtron
		int inputNumber=132;
		int num =inputNumber;
		int remainder=0;
		int result=0;
		while(inputNumber>0) {
			remainder=inputNumber%10;
			result = result+remainder*remainder*remainder;
			inputNumber=inputNumber/10;
		}
		if(num==result) {
			System.out.println("Number is armStrong");
		}
		else {
			System.out.println("Number is non-armStrong");
		}
			
	}

}
