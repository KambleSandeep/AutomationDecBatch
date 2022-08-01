package Intrpckge;

public class Maxarray {
	
	public static void main (String[] args) {
		int [] arr = new int [] {25,17,71,75,56,85};
	
	int max = arr[0];
	
	for (int i=0; i< arr.length; i++) {
		
		if (arr[i]>max)
			
			max =arr[i];
	}
	System.out.println("Largest element :" + max);	
		
		
	}}

