public class Ch7Book extends Ch7Product {

	public Ch7Book() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(1); // Tv의 가격을 100만원으로 한다.
	}

	public void use() {
		System.out.println("책을 읽는 중");
	}

	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Book";
	}
}