package Builder;

public class BuilderPatternDemo {

	public static void main(String args[]) {

		Phone phone = new PhoneBuilder().setBattery(3700).setOs("android").setProcessor("Quad Core").getPhone();

		System.out.println(phone);
	}
}
