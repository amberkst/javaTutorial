package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Tom");
		list.add("George");
		list.add("Mike");

		Vector v = new Vector(list);
		// System.out.println(v);
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
