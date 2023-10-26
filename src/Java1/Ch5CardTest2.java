public class Ch5CardTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch5CardCaseVer2 cardCase = new Ch5CardCaseVer2();

		cardCase.cardCaseInSide();

		cardCase.shuffle();
		System.out.println();

		cardCase.cardCaseInSide();

		Ch5Card cv = null;

		cv = cardCase.pick(53);

		System.out.println();
		System.out.println(cv.getCard());

	}

}
