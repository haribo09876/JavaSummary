public class Ch6TvTest {

	public static void main(String[] args) {

		Ch6Tv tv = new Ch6Tv();
		// 클래스 -> 인스턴스화 -> 인스턴스(객체)
		// tv 전원 켠다
		tv.power();

		// tv 채널을 1로 설정한다
		tv.channel = 1;

		// tv.channel = 7;
		// 채널을 5번까지 올린다
		for (int i = 0; i < 4; i++) {
			tv.channelUp();
		}

		// tv.channelDown();
		// 현재 채널을 확인한다
		System.out.println("현재 채널은 " + tv.channel + "입니다");
	}
}