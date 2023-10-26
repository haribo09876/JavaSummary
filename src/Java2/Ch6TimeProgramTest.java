public class Ch6TimeProgramTest {

	public static void main(String[] args) {
		// 비 객체지향적 코드
		int hourKorea = 0;
		int hourUK = 0;
		int hourBrazil = 0;
		int minute = 0;
		double second = 0.0;

		hourKorea = 2;
		hourUK = 16;
		hourBrazil = 14;
		minute = 10;
		second = 30;

		System.out.println("시: " + hourKorea + " 분: " + minute + " 초: " + second); // 한국 시간
		System.out.println("시: " + hourUK + " 분: " + minute + " 초: " + second); // 영국 시간
		System.out.println("시: " + hourBrazil + " 분: " + minute + " 초: " + second); // 브라질 시간
	}
}