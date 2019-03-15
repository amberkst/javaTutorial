package collection;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;

class Temp {

	@Override
	public String toString() {
		return "Temp";
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {

		// insertion order is preserved In which order we enter in same order we get.

		Temp t = new Temp();
		WeakHashMapDemo w = new WeakHashMapDemo();

		WeakHashMap<Object, String> map = new WeakHashMap<>();
		map.put(9, "Staphnie");
		map.put(1, "Mike");
		map.put(4, "John");
		map.put(6, "Rozer");
		
		map.put(3, "Alan");
		map.put(t, "Rechal");
		map.put(w, "Angelina");
		System.out.println(map);

		t = null;
		w = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);

		/*
		 * Set keys = map.keySet(); for (Object key : keys) { System.out.println(key +
		 * " " + map.get(key)); }
		 */

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public String toString() {
		return "dummy";
	}

}
