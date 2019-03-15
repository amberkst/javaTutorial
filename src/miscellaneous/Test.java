package miscellaneous;

//From this program we can understand that an interface can not extends object class (or not any other class) but although we can use
//interface reference to call object class method.

interface Demo {

}

interface User extends Demo {

}

public class Test implements User {

	public static void main(String[] args) {

		Demo t = new Test();
		System.out.println(t.getClass());
		System.out.println(t.toString());
	}

}
