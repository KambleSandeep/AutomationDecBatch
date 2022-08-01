package collection;

import java.util.TreeSet;

public class Trsttest {
	
	public static void main(String[] args) {
		
		TreeSet ts =new TreeSet();
		System.out.println(ts.size());
		System.out.println(ts.isEmpty());
		
	ts.add("A");
	ts.add("xE");
	ts.add("Y");
	ts.add("p");
	ts.add("XUS");
	ts.add("ACS");
	ts.add("20");



	
System.out.println(ts);

System.out.println("New fuction tresset ");
System.out.println(ts.first());
System.out.println(ts.last());
System.out.println(ts);

ts.pollFirst();
ts.pollLast();
System.out.println(ts);

ts.add("MM");
ts.add("TT");
System.out.println(ts);

	}	

}
