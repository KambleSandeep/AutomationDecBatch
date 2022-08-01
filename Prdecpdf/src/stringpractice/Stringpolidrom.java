package stringpractice;

public class Stringpolidrom {
	public static void main(String[] args) {

		String S1 = "Manish";

		String S2 = "";

		for (int i = S1.length() - 1; i >= 0; i--) {
			S2 = S2 + S1.charAt(i);
		}

		System.out.println(S2);

		if (S2.equals(S1)) {

			System.out.println("Thid is polidrom");

		}

		else {
			System.out.println("Thid is not polidrom");

		}
	}
}
