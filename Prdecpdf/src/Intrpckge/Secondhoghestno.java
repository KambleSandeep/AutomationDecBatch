package Intrpckge;

import java.util.Arrays;

public class Secondhoghestno {
	  
		public static int Secondhoghestno(int a[], int total){  
		Arrays.sort(a);  
		return a[total-2];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2,7};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+Secondhoghestno(a,7));  
		System.out.println("Second Largest: "+Secondhoghestno(b,7));  
		}}  
 

