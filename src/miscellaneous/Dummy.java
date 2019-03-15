package miscellaneous;



public class Dummy {

	public void printName(Object o) {
		System.out.println("Object method called");
	}
	
	public void printName(String s) {
		System.out.println("String method called");
	}
	
	public void printName(Dummy d) {
		System.out.println("Dummy called");
	}
	
	public static void main(String[] args) {
        
		Dummy d = new Dummy();
	//	d.printName(null);
	}

}
