package Intrpckge;

import java.util.Arrays;

public class CountDuplicate {

	public static void main(String s[]) {

		int arr[] = { 6, 1, 2, 1, 9, 9, 3, 1, 2, 6, 8, 5 };

		countDuplicate(arr);
	}

	static void countDuplicate(int arr[]) {
		Arrays.sort(arr);

		for (int i = 0; i < arr.length-1; i++) {
			int count = 1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
				else
					break;
			}
			if (count > 1) {
				System.out.println(arr[i] + "=" + count);
				i += (count - 1);
			}
		}
	}
}
