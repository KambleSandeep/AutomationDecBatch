package Intrpckge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class WthDupliArray {

	public static void main(String[] args) {

		ArrayList arlist = new ArrayList();

		arlist.add('a');
		arlist.add(123);
		arlist.add(null);
		arlist.add("Means");
		arlist.add('a');
		arlist.add("Means");
		arlist.add(56);
		arlist.add(null);
		arlist.add(123);

		System.out.println(arlist);

		Set set = new HashSet(arlist);

		System.out.println("arlist:" + set);

	}
}



