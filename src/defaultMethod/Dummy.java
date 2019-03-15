package defaultMethod;

interface UserDetail {

	public void work();

	default void run() {
		System.out.println("user is running");
	}
}

public class Dummy implements UserDetail {

	@Override
	public void work() {
		System.out.println("User is unemployed!");
	}

	/*public void run() {
		System.out.println("user is not running");
	}*/

	public static void main(String[] args) {
		Dummy d = new Dummy();
		d.run();
		d.work();
	}
}
