package miscellaneous;

public class SingltonClass {

	private static SingltonClass temp = new SingltonClass();

	private SingltonClass() {

	}

	public static SingltonClass getInstance() {
		if (temp == null)
			return new SingltonClass();
		else
			return temp;
	}

	
}
