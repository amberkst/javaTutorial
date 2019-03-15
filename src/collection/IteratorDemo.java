package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {

		Set<String> s = new HashSet<String>();
		s.add("Tom");
		s.add("mike");
		s.add("bruce");

		Vector<String> v = new Vector<String>(s);

		Iterator<String> itr = v.iterator();

		while (itr.hasNext()) {
			if (itr.next().equals("mike")) {
				itr.remove();
			}
		}
		System.out.println(v);
	}
}
