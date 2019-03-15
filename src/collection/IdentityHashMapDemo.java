package collection;

import java.io.ObjectOutputStream.PutField;
import java.util.IdentityHashMap;
import java.util.Set;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		Integer i1 = new Integer(10);

		IdentityHashMap<Integer, String> map = new IdentityHashMap<>();

		map.put(i, "Joseph");
		map.put(i1, "Methew");

		Set keys = map.entrySet();
		for (Object key : keys) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
