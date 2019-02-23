package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	String dogName = "Max";

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}
	
}

class Cat implements Serializable{
	Dog d = new Dog();
}

class Rat implements Serializable {
	Cat c = new Cat();
}

public class ObjectGraphEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Rat rat = new Rat();

		FileOutputStream fs = new FileOutputStream("Animal.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fs);
		obj.writeObject(rat);

		FileInputStream file = new FileInputStream("Animal.txt");
		ObjectInputStream objIn = new ObjectInputStream(file);
		Rat retrive = (Rat) objIn.readObject();
		System.out.println(retrive.c.d);

	}
}
