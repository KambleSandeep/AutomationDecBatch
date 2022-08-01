package stringpractice;

public class Armstrong {
	public static void main(String[] args) {
		int inputnumber = 153;
		int num = inputnumber;
		int reminder = 0;
		int result = 0;

		while (inputnumber>0) {
			reminder = inputnumber % 10;

			result = result + reminder * reminder * reminder;

			inputnumber = inputnumber / 10;
		}

			if (num == result) {
				System.out.println("Number is arm string");
			} else {
				System.out.println("Number is not arm strong");
			}
		}
	
}