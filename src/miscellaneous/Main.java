package miscellaneous;

public class Main {
	
	public static void main(String[] args) {
		SingltonClass s=SingltonClass.getInstance();
		System.out.println(s);
		SingltonClass s1=SingltonClass.getInstance();
		System.out.println(s1);
		SingltonClass s2=SingltonClass.getInstance();
		System.out.println(s2);


	}

}
