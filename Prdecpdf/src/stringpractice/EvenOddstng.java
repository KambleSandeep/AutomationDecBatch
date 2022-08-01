package stringpractice;

public class EvenOddstng {
	public static void main(String[] args) {
		
		String str= "abc xyz ans hnd ijk nhj jkl klj llJ";
	
		String str1 [] = str.split(" ");
		
		for (int i=0; i<=str1.length-1; i++) {
			
			if(i%2==0) // (i%2@=0) 
			{
			System.out.println(str1[i]);
		}
						
		}
	}

}
