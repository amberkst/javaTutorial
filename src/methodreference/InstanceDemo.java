package methodreference;

@FunctionalInterface
interface Temp {

	public void add();
}

public class InstanceDemo {

	public void print() {
		System.out.println("print method");
	}

	public static void main(String[] args) {
		InstanceDemo demo = new InstanceDemo();

		Temp temp = demo::print;
		temp.add();
	}
}
