public class Ch7SmartPhone extends Ch7Product {
	public Ch7SmartPhone() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(70); // Tv의 가격을 100만원으로 한다.
	}

	public void use() {
		System.out.println("폰 사용 중");
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "SmartPhone";
	}
}