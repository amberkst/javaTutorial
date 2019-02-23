package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
	String userName = "Ethan";
	transient String uPass = "P@ssw0rd";

	@Override
	public String toString() {
		return "User [userName=" + userName + ", uPass=" + uPass + "]";
	}
	
	private void writeObject(ObjectOutputStream os) throws Exception{
		os.defaultWriteObject();
		String encryptedPass="123"+uPass;
		os.writeObject(encryptedPass);
	}

	
	private void readObject(ObjectInputStream oi) throws ClassNotFoundException, IOException {
		oi.defaultReadObject();
		String decryptPass=(String) oi.readObject();
		uPass=decryptPass.substring(3);
	}
}

public class CustomizedSerialization {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user = new User();

		FileOutputStream fs = new FileOutputStream("userDetail.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fs);
		obj.writeObject(user);

		FileInputStream file = new FileInputStream("userDetail.txt");
		ObjectInputStream objIn = new ObjectInputStream(file);
		User retrive = (User) objIn.readObject();
		System.out.println(retrive);
	}
}
