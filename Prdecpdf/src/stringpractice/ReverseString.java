package stringpractice;

public class ReverseString {
	public static void main(String[] args) {
String originalStr= "This is java Program";

String Words [] = originalStr.split(" ");

String reversedString= " ";
					
	for (int i=0; i< Words.length; i++) {
	reversedString = " "+ Words[i]+ 	reversedString;
	
	}
	
	System.out.println("Reversed string	:"+ reversedString);
	
	}	
	
}



 