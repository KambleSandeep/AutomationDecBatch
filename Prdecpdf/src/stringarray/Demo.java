package stringarray;

import java.util.Arrays;

public class Demo {

public static void main(String[] args) {
	String Student [] = new String [4];
	
	Student[0]="Dinesh";
	Student[1]="Ramesh";		
	Student	[2]	="Rajesh";
	Student	[3]	="Mahesh";
		
	
	System.out.println(Student.length);
	
	
for(int i=0; i<=3; i++) {
	System.out.println(Student[i]);}
{
	System.out.println("..........Original array elements.........");
}


      Arrays.sort(Student);		// Asecnding order
      for(int i=0; i<=3; i++) {
    		System.out.println(Student[i]);}
      {
    		System.out.println("...........Ascendinf array elements .........");
    		
//for decending 
    	      for(int i=3; i>=0; i--) {
    	    		System.out.println(Student[i]);}
    	      {
}    		System.out.println("...........dcendinf array elements .........");

}
}
}