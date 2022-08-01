package Intrpckge;

public class DuplicateString {

	public static void main(String[] args) {

		String str = "Beautiful Beach";

		char[] carray = str.toCharArray();

		System.out.println("This String is:" + str);

		System.out.print("Duplicates characters in above String are :");

			for (int i = 0; i < str.length(); i++) {

				for (int j = i + 1; i < str.length(); j++) {

					if (carray[i] == carray[j]) {

						System.out.print(carray[j] + " ");
						break;
					}
				}
			}
		}
	}
