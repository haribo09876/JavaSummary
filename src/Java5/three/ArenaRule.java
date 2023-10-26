package Java5.three;

public class ArenaRule {

	// 2장의 카드 합산 결과를 돌려준다
	public static int getCardToJumsu(Card[] cardArr) {
		// 카드 변수
		String card = "";
		// 카드 점수 합산 변수
		int scoreSum = 0;

		// 카드 2장의 합산 결과 반환
		// A카드는 1, T카드는 10, J카드는 11, Q카드는 12, K카드는 13점이며
		// 나머지 카드는 숫자의 의미대로 점수를 부여한다. ex) 2카드는 2점

		return scoreSum;
	}

	// 2사람의 카드 결과를 평가한다.
	/**
	 * 
	 * @param my
	 * @param you
	 *            점수가 높은 플레이어가 승리
	 */
	public static void setGamePlayAssess(Player my, Player you) {
		if (my.getScore() > you.getScore()) {
			my.setWinner(true);
			you.setWinner(false);
		} else {
			you.setWinner(true);
			my.setWinner(false);
		}
	}

	// 게임 결과 보여주기
	public static void gamePlayResultInfo(Player my, Player you) {
		System.out.println("게임의 승자는! ");
		Card[] myCardArr = my.getMyChoiceCards();
		Card[] yourCardArr = you.getMyChoiceCards();

		StringBuffer mySb = new StringBuffer();
		StringBuffer yourSb = new StringBuffer();

		for (int i = 0; i < yourCardArr.length; i++) {
			mySb.append("<" + (i + 1) + "번째 카드> ");
			mySb.append(myCardArr[i].getCard() + " ");

			yourSb.append("<" + (i + 1) + "번째 카드> ");
			yourSb.append(yourCardArr[i].getCard() + " ");
		}

		System.out.print(my.getName() + ": " + mySb.toString() + "= " + my.getScore() + " vs ");
		System.out.println(you.getName() + ": " + yourSb.toString() + "= " + you.getScore());

		if (my.isWinner()) {
			System.out.println(my.getName() + "님 입니다.");
		} else {
			System.out.println(you.getName() + "님 입니다.");
		}
	}

}
