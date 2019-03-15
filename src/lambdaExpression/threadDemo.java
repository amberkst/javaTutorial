package lambdaExpression;

interface MyEventConsumer {

	public void consume(Object event);

}

public class threadDemo {

	public static void main(String[] args) {

		Runnable r = () -> {
			int eventCount = 0; // we can not use private protected public modifier for variable.
			for (int i = 0; i <= 5; i++) {
				System.out.println("Thread class Thread " + eventCount);
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("testDemo class Thread");
		}

	}
}
