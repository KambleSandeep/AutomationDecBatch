package stringpractice;

public class NoofSpaces1 {
	
	public static void main(String[] args) {
		String s= " Welcome to java  program JHN BHN   ";
		int count=0;
		
		for(int i=0; i<=s.length()-1; i++) {
			System.out.println(s.charAt(i));
			
			if(s.charAt(i)==' ') {
				count++;
			}
			
		}
		
		System.out.println("No of spaces+"+count);
		
	}

}
