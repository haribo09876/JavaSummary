public class Ch3Etc {

	public static void main(String[] args) {
		double dNum = 3.141592;
		System.out.println(dNum);

		// 반올림
		double changeDeoubleNum = dNum + 0.0005;
		changeDeoubleNum = (int) (dNum * 1000) / 1000.0;
		System.out.println(changeDeoubleNum);

		// 반올림
		if (dNum - (int) dNum >= 0.5) {
			System.out.println((int) dNum + 1);
		} else {
			System.out.println((int) dNum);
		}
	}
}