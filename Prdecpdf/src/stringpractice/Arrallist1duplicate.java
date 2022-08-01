package stringpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Arrallist1duplicate {
public static void main(String[] args) {
	ArrayList arlist = new ArrayList();
	
	arlist.add('a');
	arlist.add(2);
	arlist.add("Manish"); 
	arlist.add(null);
	arlist.add("Manish");
	arlist.add(null);
	arlist.add(3);
	
	System.out.println("Original ArrayList    :" + arlist);
	
	Set set = new HashSet(arlist);
	
	 System.out.println("ArrayList Unique value is :" + set);
	
 }	
 }

