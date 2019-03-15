package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		// insertion order is preserved In which order we enter in same order we get.

		Integer i = 10;

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
		map.put(9, "Staphnie");
		map.put(1, "Mike");
		map.put(4, "John");
		map.put(6, "Rozer");
		map.put(3, "Alan");
		map.put(i, "Rechal");

		i = null;
		System.out.println(map);
		Set keys = map.keySet();
		System.out.println(keys);

		for (Object key : keys) {
			System.out.println(key + " " + map.get(key));
		}

	}

}
