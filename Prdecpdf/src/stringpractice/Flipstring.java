package stringpractice;

public class Flipstring {
	
	public static void main(String[] args) {
		String originalStr= "This is java Program";

		String Words [] = originalStr.split(" ");

		String reversedString= " ";
		
		System.out.println("original Stirng :" + originalStr);
							
			for (int i=0; i< Words.length; i++) {
				
				
				String word= Words[i];
				String reverseword="";
				for (int j=word.length()-1; j >=0; j--) {
				
				reverseword = reverseword+word.charAt(j);
				}
			reversedString = " "+ Words[i]+ 	reversedString;
			
			}
			
			System.out.println("Reversed string	:"+ reversedString);
			
			}	}


