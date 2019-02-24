package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Country implements Externalizable {

	String countryName;
	String capital;
	String language;

	public Country() {

	}

	public Country(String countryName, String capital, String language) {

		this.countryName = countryName;
		this.capital = capital;
		this.language = language;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		countryName = (String) in.readObject();
		capital = (String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(countryName);
		out.writeObject(capital);
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + ", language=" + language + "]";
	}

}

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Country country = new Country("Spain", "Madrid", "Spanish");

		FileOutputStream fs = new FileOutputStream("countryDetail.src");
		ObjectOutputStream out = new ObjectOutputStream(fs);
		out.writeObject(country);

		FileInputStream fi = new FileInputStream("countryDetail.src");
		ObjectInputStream retrieve = new ObjectInputStream(fi);
		Country s = (Country) retrieve.readObject();
		System.out.println(s);
	}

}
