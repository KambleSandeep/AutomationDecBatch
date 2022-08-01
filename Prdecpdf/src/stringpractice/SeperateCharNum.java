package stringpractice;

public class SeperateCharNum {
	
	public static void main(String[] args) {
		
		String ifsc="SBIN000123456NDHB12ADH2@548SXasaew$#";
		
		
		System.out.println(ifsc.replaceAll("[0-9 @ $ #]",""));
		
		System.out.println(ifsc.replaceAll("[a-z A-Z @ $ #]",""));
		
		System.out.println(ifsc.replaceAll("[a-z A-Z 0-9]",""));


		
	}

}