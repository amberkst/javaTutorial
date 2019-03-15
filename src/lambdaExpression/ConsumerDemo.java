package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	static String s = "Ethan";

	public static void main(String[] args) {

		/*
		 * Consumer<String> c = (s) -> System.out.println(s.length()); c.accept(s);
		 */

		Consumer<List<Integer>> con = (l) -> {
			for (Integer i : l) {
				System.out.println(i * 2);
			}
		};

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(9);

		con.accept(list);

	}

}
