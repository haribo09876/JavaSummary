public class Ch5CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String choiceCardStr = "";

		// 랜덤
		// Card card = new Card();
		//
		// choiceCardStr = card.getCard();
		//
		// System.out.println(choiceCardStr);
		//
		// Card card2 = new Card(3, 12);
		// choiceCardStr = card2.getCard();
		// System.out.println(choiceCardStr);

		Ch5CardCase cardCase = new Ch5CardCase();
		cardCase.cardCaseInSide();

		cardCase.shuffle();
		System.out.println();

		cardCase.cardCaseInSide();

	}

}
