public class Ch5CardVer2 extends Ch5Card {

	static String[] specialCardColorArr = { "W_", "Y_" };
	static String[] specialCardShapeArr = { "Joker" };

	Ch5CardVer2() {
		init();
	}

	Ch5CardVer2(int colorIndex, int shapeIndex) {
		init(colorIndex, shapeIndex);
	}

	// 임의의 카드 생성 오버라이딩
	void init() {
		int probability = 0;
		int colorIndex = 0;
		int shapeIndex = 0;

		// 54개
		probability = Ch5Card.shapeArr.length * Ch5Card.numberArr.length + 2;
		// 1~54개
		probability = (int) (probability * Math.random()) + 1;

		if (probability > 52) {
			colorIndex = (int) (Math.random() * specialCardColorArr.length);
			shapeIndex = (int) (Math.random() * specialCardShapeArr.length);

			// ♣ + 5 = ♣5
			card = specialCardColorArr[colorIndex] + specialCardShapeArr[shapeIndex];
		} else {// 조커들이 아니면 일반 카드 생성
			super.init();
		}

	}

	// 수동으로 카드 생성
	void init(int colorIndex, int shapeIndex) {
		// ♣ + 5 = ♣5
		card = specialCardColorArr[colorIndex] + specialCardShapeArr[shapeIndex];
	}

}
