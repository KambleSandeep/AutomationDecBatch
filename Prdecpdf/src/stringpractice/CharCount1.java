package stringpractice;

public class CharCount1 {
	public static void main(String[] args) {
		
		String testStr="This is Java Program";
		int count=0;
		
		for(int i=0; i<=testStr.length()-1; i++) {
			
			
			if(testStr.charAt(i) == 'a') {
				count++;
			
			}
		}
		
		System.out.println(count);

	}
	

}
