package com.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class A {
	public static void main(String[] args) {

		HashMap map = new HashMap();
		System.out.println(map.size());
		System.out.println(map.isEmpty());

		map.put(10002, 23252);
		map.put(10003, "Dinesh");
		map.put(10004, "Suresh");
		map.put(10005, "Rajesh");
		map.put(null, "JADOO");
		map.put(10005, null);


		System.out.println(map.size());
		System.out.println(map.isEmpty());

		System.out.println("----other methid----");

		System.out.println(map);

		System.out.println("Veiw of map");

		System.out.println(map.keySet());  //[10002, 10003, 10004, 10005]
		System.out.println(map.values());  //[Ramesh, Dinesh, Suresh, Rajesh]
		System.out.println(map.entrySet()); //[10002=Ramesh, 10003=Dinesh, 10004=Suresh, 10005=Rajesh]
		
		Set key = map.keySet();
		Collection values = map.values();
		Set entry = map.entrySet();
		
		System.out.println("-----read map-----");
		
		System.out.println(map.containsKey(10003));
		System.out.println(map.containsValue("Rajesh"));
		System.out.println(map.get(10002));

        System.out.println("----Remove------");
        map.remove(10002);        					//{10003=Dinesh, 10004=Suresh, 10005=Rajesh}

        System.out.println(map);
	}

}
