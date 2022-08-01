package stringarray;

import java.util.Arrays;

public class Demo2 {
public static void main(String[] args) {
	
	
	int num[]= {545,686,5255,588,888,24,1,2355,12};
System.out.println(num.length);

for (int i=0; i<=num.length-1;i++) {
	System.out.println(num[i]);
}
{System.out.println("......Origional array elements......");}



Arrays.sort(num);
for (int i=0; i<=num.length-1;i++) {
	System.out.println(num[i]);
}
{System.out.println("......Ascending array elements......");}

for (int i=num.length-1; i>=0;i--) {
	System.out.println(num[i]);
}
	
{	
	System.out.println("......decending array elements......");

}
}
}
