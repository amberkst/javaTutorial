package defaultMethod;

//multiple inheritance ambiguity problem explained in this program

interface A {

	default void run() {
		System.out.println("interface A run method");
	}
}

interface B {
	default void run() {
		System.out.println("interface A run method");
	}
}

public class Employee implements A, B {

	public void run() {
		A.super.run();
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.run();
	}
}
