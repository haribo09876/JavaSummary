public class Ch5CardCaseVer2 extends Ch5CardCase {

	Ch5CardCaseVer2() {
		numOfCards = (Ch5Card.shapeArr.length * Ch5Card.numberArr.length)
				+ (Ch5CardVer2.specialCardColorArr.length * Ch5CardVer2.specialCardShapeArr.length);

		cardArr = new Ch5Card[numOfCards];

		init();

	}

	void init() {
		int totalCnt = 0; // 52장의 카드를 위한 배열 인덱스

		for (int i = 0; i < Ch5Card.shapeArr.length; i++) {
			for (int n = 0; n < Ch5Card.numberArr.length; n++) {
				cardArr[totalCnt] = new Ch5Card(i, n);
				totalCnt++;
			}
		}

		// 조커 카드 등록
		for (int i = 0; i < Ch5CardVer2.specialCardColorArr.length; i++) {
			for (int n = 0; n < Ch5CardVer2.specialCardShapeArr.length; n++) {
				cardArr[totalCnt] = new Ch5CardVer2(i, n);
				totalCnt++;
			}
		}

	}

	@Override
	void cardCaseInSide() {
		Ch5Card otherCard = null;
		String choiceCardStr = "";

		for (int i = 0; i < numOfCards - 1; i++) {
			otherCard = cardArr[i];

			choiceCardStr = otherCard.getCard();

			System.out.print(choiceCardStr + ", ");

			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println(cardArr[cardArr.length - 1].card);
	}

}
// 카드케이스 조회 메서드는 있다 일단
// public void cardCasePrint() {
// for (int i = 0; i < cardArr.length-1; i++) {
// System.out.println();
//
// }
// }
