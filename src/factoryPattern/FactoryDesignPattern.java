package factoryPattern;

public class FactoryDesignPattern {

	public OS getInstance(String str) {
		if (str.equals("Open")) {
			return new Windows();
		} else if (str.equals("Close")) {
			return new IOS();
		}

		else
			return new Andriod();
	}

}
