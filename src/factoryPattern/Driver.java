package factoryPattern;

public class Driver {

	public static void main(String[] args) {

		FactoryDesignPattern fs = new FactoryDesignPattern();
		OS o = fs.getInstance("Close");
		o.osDesign();
	}

}
