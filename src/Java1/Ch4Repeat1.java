public class Ch4Repeat1 {

	public static void main(String[] args) {
		// 2 * 1 = 2 2 * 2 = 4 2 * 9 = 18
		// 3 * 1 = 3 3 * 2 = 6 3 * 9 = 27
		// ,
		// ,
		// , ,,,
		//
		//
		// 8 * 1 = 8 8 * 2 = 16 8 * 9 = 72
		// 9 * 1 = 9 9 * 2 = 18 9 * 9 = 81

		// 2차원 배열
		//
		// 결과만 배열에 저장한다
		//
		// 결과만 저장하는 로직
		//
		// 출력만 수행하는 로직
		// println(i + " * " + n "=" + gugudanNumArr[0][0])
		int[][] multiplyArr = new int[8][9];

		for (int i = 0; i < multiplyArr.length; i++) {
			for (int j = 0; j < multiplyArr[0].length; j++) {
				multiplyArr[i][j] = (i + 2) * (j + 1);
				System.out.print((i + 2) + " * " + (j + 1) + " = " + multiplyArr[i][j] + "\t\t");
			}
			System.out.println();
		}
	}
}