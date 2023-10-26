public class Ch5Array3 {

	public static void main(String[] args) {
		// 2차원 배열을 공부해보자
		//
		// 10 10 10 10 10
		// 20 20 20 20 20
		// 30 30 30 30 30
		// 40 40 40 40 40
		int[][] arr = new int[4][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = i * 10 + 10;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
