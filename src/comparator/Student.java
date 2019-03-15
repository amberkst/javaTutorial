package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Sortbyname implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll name
	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
		// return b.name.compareTo(a.name);
		// return -a.name.compareTo(b.name);
		// return -b.name.compareTo(a.name);
		// return 0;
		// return -1;
		// return +1;
	}
}

class SortbyRoll implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.rollNo - o1.rollNo;
	}

}

public class Student {

	String name;
	int rollNo;
	int contactNo;

	public Student(String name, int rollNo, int contactNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", contactNo=" + contactNo + "]";
	}

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Ethan", 112, 9923));
		list.add(new Student("Bruce", 101, 2259));
		list.add(new Student("Tony", 118, 9929));
		list.add(new Student("Ethan", 112, 9923));
		Collections.sort(list, new Sortbyname());

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));

		list.add(new Student("Ethan", 112, 9923));

		Collections.sort(list, new SortbyRoll());

		System.out.println();

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}

}
