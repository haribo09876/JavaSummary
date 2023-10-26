public class Ch6Car2 {
	String color = "";
	String gearType = "";
	int door = 0;

	// 기본 생성자 만들기
	Ch6Car2() {
		color = "빨간색";
		gearType = "manual";
		door = 2;
	}

	void carInfo() {
		System.out.println("자동차의 색상 : " + this.color);
		System.out.println("자동차의 기어 : " + this.gearType);
		System.out.println("자동차 문의 수 : " + this.door);
	}
}