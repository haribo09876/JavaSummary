public class Ch5CardCase {

	int numOfCards = Ch5Card.shapeArr.length * Ch5Card.numberArr.length;
	Ch5Card[] cardArr = new Ch5Card[numOfCards];

	Ch5CardCase() {
		int totalCount = 0;

		for (int i = 0; i < Ch5Card.shapeArr.length; i++) {
			for (int n = 0; n < Ch5Card.numberArr.length; n++) {
				// 카드를 하나씩 만드는 곳
				cardArr[totalCount] = new Ch5Card(i, n);
				totalCount++;
			}
		} // 전체 for end

	}

	// 수동으로 카드 선택
	Ch5Card pick(int index) {
		return cardArr[index];
	}

	Ch5Card pick() {
		int index = 0;
		index = (int) (Math.random() * numOfCards);

		return pick(index);
	}

	void shuffle() {
		int rand = 0;
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int) (Math.random() * numOfCards);

			Ch5Card tempCard = cardArr[i];
			cardArr[i] = cardArr[rand];
			cardArr[rand] = tempCard;

		}
	}

	// 카드케이스의 카드 보기
	void cardCaseInSide() {
		Ch5Card otherCard = null;
		String choiceCardStr = "";

		for (int i = 0; i < numOfCards; i++) {

			otherCard = cardArr[i];

			choiceCardStr = otherCard.getCard();

			System.out.print(choiceCardStr + " ");
		}
	}
}
