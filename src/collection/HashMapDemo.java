package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		// insertion order is not preserved

		Map<Integer, String> map = new HashMap<>();

		map.put(9, "Staphnie");
		map.put(10, "Mike");
		map.put(4, "John");
		map.put(6, "Rozer");
		map.put(9, "Alan");

		
		  System.out.println(map);
		  
		  Set keys = map.keySet(); System.out.println(keys);
		  
		  for (Object key : keys) { System.out.println(key + " " + map.get(key)); }
		 
	}

}
