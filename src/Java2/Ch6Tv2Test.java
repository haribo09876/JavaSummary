public class Ch6Tv3Test {

	public static void main(String[] args) {
		// class 타입 참조변수 = new 클래스명();
		// 참조변수 reference 객체 선언
		Ch6Tv2 tv = new Ch6Tv2();
		Ch6Tv2 tv2 = new Ch6Tv2();

		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);

		tv2 = tv; // new 형태들은 주소값과 연관이 되므로, 주소값을 기준으로 답을 찾아가야 함!!!
		tv.channel = 7;
		tv2.channel = 10;
		System.out.println("tv의 값을 7로 변경함");

		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);
	}
}