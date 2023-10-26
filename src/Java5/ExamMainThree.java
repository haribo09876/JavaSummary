import hk.exam.seven.ArenaRule;
import hk.exam.seven.Card;
import hk.exam.seven.Player;

public class ExamMainThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 이름, 나이 생성
		Player you = new Player("젤잘나가", 26);
		Player my = new Player("안졸리나제리", 24);

		// 경기에 이용할 카드 2장
		Card[] yourCards = new Card[2];
		Card[] myCards = new Card[2];

		// 경기 시작 전 카드를 잘 섞는다.
		my.shuffle();
		you.shuffle();

		// 게임 라운드 총 3번
		for (int i = 1; i <= 3; i++) {
			// 나의 카드 2장 뽑기
			myCards = my.drawCard();
			// 상대방 카드 2장 뽑기
			yourCards = you.drawCard();

			// 나의 카드들의 합
			my.setScore(ArenaRule.getCardToJumsu(myCards));
			// 상대방의 카드들의 합
			you.setScore(ArenaRule.getCardToJumsu(yourCards));

			// 경기 라운드 표시
			System.out.print(i + "번째 ");

			// 나와 상대방의 점수 대결
			ArenaRule.setGamePlayAssess(my, you);

			// 점수 대결 후 결과표시
			ArenaRule.gamePlayResultInfo(my, you);

			System.out.println();
		}

	}

}
