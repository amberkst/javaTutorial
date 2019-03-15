package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		//Insertion order is not preserved.
		
		Set<Object> h = new LinkedHashSet<Object>();
		h.add(129);
		h.add("Bruce");
		h.add("Mike");
		h.add("Staphnie");
		h.add("Ethan");
		h.add(123);
		for(Object o: h) {
			System.out.println(o);
		}

	}

}
