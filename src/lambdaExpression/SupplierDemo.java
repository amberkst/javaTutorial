package lambdaExpression;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Double> randomValue = () -> Math.floor((Math.random() * 10));

		System.out.println(randomValue.get());

	}

}
