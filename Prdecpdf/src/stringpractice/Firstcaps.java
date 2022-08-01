package stringpractice;

public class Firstcaps {
	public static void main(String[] args) {
		
	
	
	String str= "this is java program with slelnium and testng";
	
	
		String[] word = str.split(" ");
	
	for (int i=0; i<=word.length-1; i++) {
		
		
		String word1 = word[i];   //this
		
		String str2 = word1.substring(0,1).toUpperCase()+word1.substring(1,word1.length());
		
		
		System.out.println(str2);
		
	}
		
		
		
	}

}	
