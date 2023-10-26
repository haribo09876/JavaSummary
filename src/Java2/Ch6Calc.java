public class Ch6Calc {

	// 사칙연산을 수행하는 메서드를 구현하시오
	// 기능별로 나누어 메서드 구현 하는 것이 보다 효율적!!!
	void add(int a, int b) {
		int result = 0;
		result = a + b;
		System.out.println(result);
	}

	void minus(int a, int b) {
		int result = 0;
		result = a - b;
		System.out.println(result);
	}

	void multiple(int a, int b) {
		int result = 0;
		result = a * b;
		System.out.println(result);
	}

	void divide(int a, int b) {
		double result = 0;
		result = a / b;
		System.out.println(result);
	}
}