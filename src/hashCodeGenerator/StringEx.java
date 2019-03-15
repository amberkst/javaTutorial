package hashCodeGenerator;

public class StringEx {

	static String human1 = "Ethan";
	static String human2 = "Ethan";
	static String human3 = new String("Ethan");

	public static void main(String[] args) {

		System.out.println(human1.hashCode());
		System.out.println(human2.hashCode());
		System.out.println(human3.hashCode());
	}

}
