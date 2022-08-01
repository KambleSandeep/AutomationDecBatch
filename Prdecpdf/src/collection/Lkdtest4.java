package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Lkdtest4 {
	
	
	public static void main(String[] args) {
		LinkedHashSet link = new LinkedHashSet(); 
		
		link.add("A");
		link.add("Tester");
		link.add('B');								//duplicate is allow 
		link.add('B');
		link.add(null);
		
		
		System.out.println(link.isEmpty());			//true
		System.out.println(link.size());			//false
		
		link.remove(null);
		System.out.println(link);
		System.out.println(link.contains("A"));
		
		
		Iterator itr = link.iterator();
		
		System.err.println("---Reading using  iterator------ ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
