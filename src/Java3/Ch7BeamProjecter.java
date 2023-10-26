public class Ch7BeamProjecter {

	boolean power = false;
	String productName = "";
	String producedDate = "";
	int volume = 0;

	public Ch7BeamProjecter(boolean power, String productName, String producedDate, int volume) {
		this.power = power;
		this.productName = productName;
		this.producedDate = producedDate;
		this.volume = volume;
	}

	void power() {
		power = !power;
		if (power == true) {
			System.out.println("전원이 켜졌습니다");
		} else {
			System.out.println("전원이 꺼졌습니다");
		}
	}

	void volumeUp(int volume) {
		this.volume = volume;
		volume++;
		System.out.println("볼륨: " + volume);
	}

	void volumeDown(int volume) {
		this.volume = volume;
		volume--;
		System.out.println("볼륨: " + volume);
	}
}