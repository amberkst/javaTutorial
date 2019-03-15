package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
// comparable and homogeneous element allowed only.

		TreeSet<String> t = new TreeSet<String>();
		t.add("A");
		t.add("Z");
		t.add("M");

		for (Object s : t) {
			System.out.println(s);
		}

		// StringBuffer is not implement comparable hence we can not add it into TreeSet
		// directly.

		/*
		 * TreeSet<Object> t1 = new TreeSet<Object>(); t1.add(new
		 * StringBuffer("Ethan")); t1.add(new StringBuffer("Mark")); t1.add(new
		 * StringBuffer("Bruce")); for (Object s : t1) { System.out.println(s); }
		 */
	}

}
