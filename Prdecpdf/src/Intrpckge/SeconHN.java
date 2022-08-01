package Intrpckge;

import org.apache.batik.apps.rasterizer.Main;

public class SeconHN {

	public static int SeconHN(int a[], int total) {

		int temp;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					temp = a[j];

				}

			}
		}
		return a[total - 2];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 4, 7, 85, 9 };
		System.out.println(SeconHN(a, 10));
	}

}
