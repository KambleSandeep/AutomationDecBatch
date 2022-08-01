package allmethod;

public class P {
	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;
	}

	protected static long muli(long n, long m) {
		long muli = n * m;
		return muli;
	}

	private static double substraction(double k, double q) {
		double sub = k - q;
		return sub;
	}

	float division(float e, float f) {
		float d = e / f;
		return d;
	}

	public static void main(String[] args) {

		System.out.println(P.addition(20, 10));
		System.out.println(P.muli(5, 6));
		System.out.println(P.substraction(15, 5));
		P f=new P();
        System.out.println(f.division(8,6));	
        }

}
