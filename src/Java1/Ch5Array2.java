public class Ch5Array2 {

	public static void main(String[] args) {
		int[] numArr = { 1, 5, 3, 10, 7 };
		// 오름차순으로 정렬
		int tempNum = 0;

		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr.length - 1; j++) {
				if (numArr[j] > numArr[j + 1]) {
					tempNum = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = tempNum;
				}
			}
		}
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
	}
}
