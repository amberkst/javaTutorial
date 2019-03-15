package overrideing;

class Parent {

	int x = 10;

	public void show() {
		System.out.println("Parent show method");
	}
}

public class Child extends Parent {

	public void show() {
		System.out.println("Parent show method");
	}

	public static void main(String[] args) {

		Parent p =new Child();
		p.show();
	}

}
