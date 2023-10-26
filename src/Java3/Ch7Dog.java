public class Ch7Dog implements Ch7Animal, Ch7Sociability {

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

	// 입으로 먹는다
	@Override
	public void eat() {
		System.out.println("개는 " + mouth + "으로 먹는다");
	}

	// 동물들은 잠을 잔다
	@Override
	public void sleep() {
		System.out.println("동물들은 잠을 잔다");
	}

	@Override
	public void kind() {
		System.out.println("사회성?");
	}
}