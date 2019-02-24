package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal {

	String animalName = "Lion";

	Animal() {
		System.out.println("Animal constructor");
	}
}

class Elephant extends Animal implements Serializable {

	String elephantName = "baghira";

	Elephant() {
		System.out.println("Elephant constructor");
	}

	@Override
	public String toString() {
		return "Elephant [elephantName=" + elephantName + "," + "animalName=" + animalName + "]";
	}

}

public class ChildInheritanceEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Elephant elephant = new Elephant();
		elephant.animalName = "Tiger";
		elephant.elephantName = "chotaBaghira";

		FileOutputStream fs = new FileOutputStream("Elephant.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fs);
		obj.writeObject(elephant);

		FileInputStream file = new FileInputStream("Elephant.txt");
		ObjectInputStream objIn = new ObjectInputStream(file);
		Elephant retrive = (Elephant) objIn.readObject();
		System.out.println(retrive);
	}
}
