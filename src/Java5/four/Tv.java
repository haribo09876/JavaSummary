public class Tv extends Ch7Product {
	public Tv() {
		// 조상클래스의 생성자 Product(double price)를 호출한다.
		super(109999.0); //
	}

	public Tv(String name, String explain) {
		this();
		super.name = name;
		super.explain = explain;
	}
}
