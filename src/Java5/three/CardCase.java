import java.util.ArrayList;
import java.util.List;

public class CardCase {

	// 52장의 카드를 담는 참조변수
	private List<Card> cardList = null;

	public CardCase() {
		cardList = new ArrayList();
	}

	public List<Card> getCardList() {
		return cardList;
	}

	public void setCardList(List<Card> cardList) {
		this.cardList = cardList;
	}

	// 카드덱에 52장의 카드들을 셋팅함
	public void init() {
		Card card = null;
		cardList.clear();

		for (int i = 0; i < Card.shape.length; i++) {
			for (int n = 0; n < Card.number.length; n++) {
				card = new Card(i, n);
				cardList.add(card);
			}
		} // 전체 for문 종료
	}

	// 카드덱의 순서와 모양을 출력
	void cardCasePrint() {
		for (int i = 0; i < cardList.size(); i++) {
			System.out.print(cardList.get(i) + "\t");
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
	}

}
