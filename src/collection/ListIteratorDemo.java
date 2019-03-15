package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Staphnie");
		list.add("Rechal");
		list.add("Green");

		ListIterator<String> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
