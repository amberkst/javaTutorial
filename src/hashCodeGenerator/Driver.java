package hashCodeGenerator;

public class Driver {

	public static void main(String[] args) {

		Human human1 = new Human(1, "Ethan");
		int ethanHashCode = human1.hashCode();
		System.out.println(ethanHashCode);

		Human human2 = new Human(2, "Mark");
		int markHashCode = human2.hashCode();
		System.out.println(markHashCode);
	}
}
