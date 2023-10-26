public class Ch7Rabbit implements Ch7Animal {

	// 다리가 있다
	int leg = 0;
	// 입이 있다
	String mouth = "";

	// 4발로 걷는다
	@Override
	public void walk() {
		System.out.println(leg + "발로 걷는다");
	}

	// 4발로 달린다
	@Override
	public void run() {
		System.out.println(leg + "발로 달린다");
	}

	// 토끼는 냠냠 먹는다
	@Override
	public void eat() {
		System.out.println("토끼는 " + mouth + "으로 냠냠 먹는다");
	}

	// 동물들은 잠을 잔다
	@Override
	public void sleep() {
		System.out.println("동물들은 잠을 잔다");
	}
}