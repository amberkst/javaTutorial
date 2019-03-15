package staticMethod;

interface UserWork {

	static void work() {
		System.out.println("user is budy in programming");
	}
}

public class User implements UserWork{

	
	
	public static void main(String[] args) {

		UserWork.work();
		User user = new User();
	    //user.work();            //static method of an interface is not available in concrete class.
	}

}
