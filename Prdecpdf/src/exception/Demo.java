package exception;

public class Demo {

	public static void main(String[] args) {
		String str = null;
		String[] s1 = { "java", "lava", "kava" };

		try {
			System.out.println(s1[3]);
		}
		 catch (Exception e)
		 {
			System.out.println("here exception occurred");
		}
	}

}