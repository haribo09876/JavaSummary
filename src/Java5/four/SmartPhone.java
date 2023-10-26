public class SmartPhone extends Ch7Product {

	public SmartPhone() {
		super(300000.00);
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String name, String explain) {
		this();
		super.name = name;
		super.explain = explain;
	}

}
