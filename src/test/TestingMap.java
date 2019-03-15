package test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestingMap {

	public static void main(String[] args) {

		Integer i = new Integer(10);
		Integer i1 = new Integer(10);
		Map<Object, Object> map = new IdentityHashMap<>();
		map.put(i, 10);
		map.put(i1, 5);

		System.out.println(map.get(i));
		System.out.println(map.get(i1));

	}

}
