public class Ch4Flow3 {

	public static void main(String[] args) {
		// 중첩 반복문
		//
		// 2 * 1 = 2 3 * 1 = 3 , , , , 9 * 1 = 9
		// 2 * 2 = 4 , 9 * 2 = 18
		// 2 * 3 = 6 , ,
		// 2 * 4 = 8 , ,
		// 2 * 5 = 10 ,
		// 2 * 6 = 12
		// 2 * 7 = 14
		// 2 * 8 = 16 3 * 8 = 24 9 * 8 = 72
		// 2 * 9 = 18 3 * 9 = 27 9 * 9 = 81
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}