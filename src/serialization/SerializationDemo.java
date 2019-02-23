package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	String sUserName = "Ethan";
	transient String sPass = "P@ssw0rd";
 // if we make transient of static and final variable then there is no change original value will be save.
	@Override
	public String toString() {
		return "Student [sUserName=" + sUserName + ", sPass=" + sPass + "]";
	}

}

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student();

		FileOutputStream fs = new FileOutputStream("studentDetail.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fs);
		obj.writeObject(student);

		FileInputStream file = new FileInputStream("studentDetail.txt");
		ObjectInputStream objIn = new ObjectInputStream(file);
		Student retrive = (Student) objIn.readObject();
		System.out.println(retrive);
	}
}
