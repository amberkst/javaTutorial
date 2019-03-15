package lambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
}

public class User1 {
	public static void main(String[] args) {
		List<Employee> al = new ArrayList<>();
		al.add(new Employee("Ethan", 20));
		al.add(new Employee("Bruce", 17));
		al.add(new Employee("Tony", 19));
		System.out.println(al);
		System.out.println();

		Collections.sort(al, (e1, e2) -> (e1.name.compareTo(e2.name)));
		System.out.println(al);
		System.out.println();

		Collections.sort(al, (e1, e2) -> (e1.age < e2.age) ? -1 : e1.age > e2.age ? 1 : 0);
		System.out.println(al);
	}

}
