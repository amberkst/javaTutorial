package lambdaExpression;

@FunctionalInterface
interface Demo {

	public int add(int n, int b);
}

public class Add {

	public static void main(String[] args) {
		Demo d = (a, b) -> a + b;
		System.out.println("Sum = " + d.add(5, 6));
	}
}
