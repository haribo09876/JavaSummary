public class Ch5Card {

	static String[] shapeArr = { "♥", "◆", "♠", "♣" };
	static String[] numberArr = { "A", "2", "3", "4",
			"5", "6", "7", "8", "9", "T", "J", "Q", "K"
	};

	String card = "";

	Ch5Card() {
		init();
	}

	Ch5Card(int shapeIndex, int numberIndex) {
		init(shapeIndex, numberIndex);
	}

	// 임의의 카드 생성
	void init() {
		// 모양 랜덤 선택
		int shapeIndex = (int) (Math.random() * shapeArr.length);
		// 숫자 랜덤 선택
		int numberIndex = (int) (Math.random() * numberArr.length);

		// ♣ + 5 = ♣5
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}

	// 수동으로 카드 생성
	void init(int shapeIndex, int numberIndex) {
		// ♣ + 5 = ♣5
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}

	// 카드를 확인할 수 있는 곳
	String getCard() {
		return card;
	}

}
