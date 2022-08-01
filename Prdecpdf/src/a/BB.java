package a;

import java.util.Arrays;

public class BB {
	
	public static void main(String[] args) {
		int num[]=new int [4];
		num[0]=556;
		num[1]=355;
		num[2]=154;
		num[3]=585;
		
	//int num []= {556,355,154,585};
	System.out.println(num.length);
	for (int i=0; i<=num.length-1; i++)
	{	
	System.out.println(num[i]);
	}
System.out.println("in ascending......... order");
Arrays.sort(num);
	for(int i=0; i<=num.length-1; i++)
	{System.out.println(num[i]);
	}
	System.out.println("in descending oredr ..");

	for(int i=num.length-1; i>=0; i--)
	{System.out.println(num[i]);
	}
}
}