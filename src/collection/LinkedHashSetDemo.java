package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		// Insertion Order is preserved
		LinkedHashSet<Object> h = new LinkedHashSet<>();
		h.add("");
		h.add("Bruce");
		h.add(null);
		h.add("Mike");
		h.add("Alan");
		h.add("");
		h.add(123);
		h.add("Staphnie");

		for (Object o : h) {
			System.out.println(o);
		}

	}

}
