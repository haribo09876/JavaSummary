public class Card {
	static String[] shape = { "♥", "◆", "♠", "♣" };
	static String[] number = { "A", "2", "3", "4", "5", "6",
			"7", "8", "9", "T", "J", "Q", "K" };

	// 실제 이용할 카드 변수
	private String card = "";

	public Card() {
		init();
	}

	public Card(int shapeIndex, int numberIndex) {
		init(shapeIndex, numberIndex);
	}

	// 임의의 카드 생성
	public void init() {
		int shapeIndex = (int) (Math.random() * shape.length); // 모양 랜덤으로 선택
		int numberIndex = (int) (Math.random() * number.length); // 숫자 랜덤으로 선택

		card = shape[shapeIndex] + number[numberIndex]; // ♥7, ♣4와 같은 모양이 됨
	}

	// 수동으로 카드 생성
	public void init(int shapeIndex, int numberIndex) {
		card = shape[shapeIndex] + number[numberIndex]; // ♥7, ♣4와 같은 모양이 됨
	}

	// 카드 한장 뽑기
	public String getCard() {
		return card;
	}

}
