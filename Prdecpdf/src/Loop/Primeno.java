package Loop;

public class Primeno {
	public static void main(String[] args) {
		int no =10;
		int flag=0;
		
		for (int x=2; x<no; x++) {
			if (no%x==0) {
				flag++;
			}
		}
		if (flag>0) {
			System.out.println(no + "is not prime");
		}
		else {
			System.out.println(no + "is prime no");
		}
	}

}
