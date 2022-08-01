package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import javax.lang.model.util.Elements;

public class Test1 {
public static void main(String[] args) {
	Vector v= new Vector();
	
	
	System.out.println(v.capacity());
	System.out.println(v.isEmpty());
	System.out.println(v.size());
	
	v.add('X');
	v.add("abc");
	v.add(50);
	v.add(null);
	v.add("abc");
	v.add("Xyz");

	
	System.out.println(v.size());
	
	System.out.println(".............Added Elements.......");
	System.out.println(v);
	System.out.println(v.indexOf("abc"));         //1
	System.out.println(v.get(3));				//null
	System.out.println(v.lastIndexOf("abc"));
	System.out.println(v.contains("X"));         //false
	v.add(3,"Name");
	System.out.println(v);
	
	v.set(1, "Rock");
	System.out.println(v);
	v.remove(3);
	System.out.println(v);
	
	System.out.println(".....reading using iterator//..");
	
	Iterator itr = v.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
			
		System.out.println(".....reading using enumaration//..");

	Enumeration enm = v.elements();
	while(enm.hasMoreElements()) {
		System.out.println(enm.nextElement());
	}
		
		Collections.reverse(v);
		System.out.println("......Reading data enumaration reverse....");
		
		Enumeration enm1 = v.elements();
		while(enm1.hasMoreElements()) {
			System.out.println(enm1.nextElement());
		
		
}
}}