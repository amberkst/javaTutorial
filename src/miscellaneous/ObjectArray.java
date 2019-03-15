package miscellaneous;

import java.util.ArrayList;
import java.util.List;

class Student {

	String name;
	int contact;

	public Student(String name, int contact) {
		this.name = name;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", contact=" + contact + "]";
	}

}

class Customer {
	String cName;
	int cContact;

	public Customer(String cName, int cContact) {

		this.cName = cName;
		this.cContact = cContact;
	}

	@Override
	public String toString() {
		return "Customer [cName=" + cName + ", cContact=" + cContact + "]";
	}

}

public class ObjectArray {

	public static void main(String[] args) {

		Object[] o = new Object[5];
		o[0] = new Student("34234", 452345);
		o[1] = new Customer("fasd", 54546);
// if we want to store different type of object in our array then we have to make it object type.
		for (Object s : o) {
			System.out.println(s);
		}

		System.out.println();

		List<Object> lst = new ArrayList<>();
		lst.add(new Student("Ethan", 123456));
		lst.add(new Customer("TenaliRama", 11111));

		for (Object obj : lst) {
			System.out.println(obj);
		}
	}
}
