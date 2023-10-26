public class Ch6TimeTest {

	public static void main(String[] args) {
		// 객체지향적 코드
		Ch6Time kroeaTime = new Ch6Time();
		Ch6Time americaTime = new Ch6Time();
		Ch6Time ukTime = new Ch6Time();

		kroeaTime.setHour(2);
		kroeaTime.setMinute(10);
		kroeaTime.setSecond(30);
		System.out.println(
				"korea시: " + kroeaTime.getHour() + " kroea분: " + kroeaTime.getMinute() + " kroea초: " + kroeaTime.getSecond());

		americaTime.setHour(11);
		americaTime.setMinute(10);
		americaTime.setSecond(30);
		System.out.println("america시: " + americaTime.getHour() + " america분: " + americaTime.getMinute() + " america초: "
				+ americaTime.getSecond());

		ukTime.setHour(18);
		ukTime.setMinute(10);
		ukTime.setSecond(30);
		System.out.println("uk시: " + ukTime.getHour() + " uk분: " + ukTime.getMinute() + " uk초: " + ukTime.getSecond());
	}
}