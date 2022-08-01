package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList ar = new ArrayList();
		
		ar.add(2);
		ar.add("Java");
		ar.add('A');
		ar.add(2);
		ar.add(null);
		
		
		System.out.println(ar.size());			//5
		System.out.println(ar.isEmpty());		//false

		System.out.println(".....Different operataion...");
		System.out.println(ar.indexOf(2));		//0
		System.out.println(ar.lastIndexOf(2));		//3
		System.out.println(ar.contains("KL"));     //false
		System.out.println(ar.contains("Java"));   //true
		System.out.println(ar.get(4));				//null
		System.out.println(ar);
		ar.add(3,"ABC");
		System.out.println(ar);					//[2, Java, A, ABC, 2, null]
		ar.add(5,"xyz");
		
		
		System.out.println(ar);					//[2, Java, A, ABC, 2, xyz, null]

		ar.remove(5);
		System.out.println(ar);				//[2, Java, A, ABC, 2, null]
		
		System.out.println("...read using ietrator....");
		
		
		//for (int i=0; i<=ar.size()-1; i++)
		//{System.out.println(ar.get(i));
		
		//Iterator itr = ar.iterator();
		//while(itr.hasNext()) {
			//System.out.println(itr.next());
			//Thread.sleep(1000);
			
			ListIterator aaa = ar.listIterator();
			while(aaa.hasNext()) {
				System.out.println(aaa.next());
			}
			
		}


		
		
	}


