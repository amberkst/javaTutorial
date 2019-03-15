package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;
	String grade;

	public Student(String name, int marks, String grade) {
		super();
		this.name = name;
		this.marks = marks;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

}

public class PredicateDemo {

	public static void main(String[] args) {

		// Predicate<Integer> p1 = (I) -> I > 5;
		Predicate<Student> p = (s) -> s.marks > 10;
		Predicate<Student> p2 = (temp) -> temp.marks < 20;

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Ethan", 5, "Second Grade"));
		list.add(new Student("Bruce", 15, " First Grade"));
		list.add(new Student("Staphnie", 18, " First Grade"));
		list.add(new Student("Mark", 25, " First Grade"));
		list.add(new Student("Ethan", 6, "Second Grade"));
		list.add(new Student("Ethan", 0, "third Grade"));

		// System.out.println(p1.test(6));

		for (Student s : list) {
			if (p2.and(p).test(s)) {
				System.out.println(s.name + " " + s.grade + " " + s.marks);
			}
		}

	}

}
