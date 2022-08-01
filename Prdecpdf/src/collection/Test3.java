package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test3 {
	public static void main(String[] args) {
	LinkedList li = new 	LinkedList();
	
	System.out.println(li.isEmpty());
	System.out.println(li.size());
	
	li.add("xyz");
	li.add(50);
	li.add('D');
	li.add(null);
	li.add("xyz");
	
System.out.println(li);
System.out.println(li.isEmpty());
System.out.println(li.size());
// li.clear();						ALL ELEMENTS WILL DELETE	
System.out.println(li.indexOf("xyz"));				//0
System.out.println(li.lastIndexOf("xyz"));			//4
System.out.println(li.contains(80));				//false	

li.add(3,"zzzz");									//[xyz, 50, D, zzzz, null, xyz]

System.out.println(li);

System.out.println(li.get(3));					//zzzz
li.set(4, "Rock");
System.out.println(li);							//[xyz, 50, D, zzzz, Rock, xyz]
li.remove(3);
System.out.println(li);	

System.out.println("......New method in linkedlist .....");
li.addLast("IM2020");
li.addFirst("303030");
System.out.println(li);			     //[303030, xyz, 50, D, Rock, xyz, IM2020]
System.out.println(li.getFirst());	//303030
System.out.println(li.getLast());  //IM2020

li.removeFirst();
li.removeLast();
System.out.println(li);			//[xyz, 50, D, Rock, xyz]

System.out.println("...Readusing cusrsor......");
		Iterator iter = li.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
			System.out.println(".....Reverese element...");
			
			Collections.reverse(li);
			
			ListIterator listitr = li.listIterator();
			while(listitr.hasNext()){
				System.out.println(listitr.next());
			
		}
}}
