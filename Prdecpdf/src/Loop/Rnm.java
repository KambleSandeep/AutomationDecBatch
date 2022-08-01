package Loop;

import java.util.Random;

public class Rnm {
	public static void main(String[] args) {
		int no=6;
	Random r=new Random();
		for (int i=1; i<=2; i++)
		{
			int vax = r.nextInt(no);
			System.out.println(vax);
		}
		
	}

}
