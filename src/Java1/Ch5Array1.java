public class Ch5Array1 {

	public static void main(String[] args) {
		// 최대값과 최소값 구하기
		//
		// 79, 88, 91, 33이라는 숫자가 존재한다
		//
		// 이들 중에 최대값, 최솟값을 구하라

		int[] numArr = { 79, 88, 91, 33 };
		int max = numArr[0];
		int min = numArr[0];

		for (int i = 0; i < 4; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}
			if (min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}
