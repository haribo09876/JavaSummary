public class Ch7BeamProjecterTest {

	public static void main(String[] args) {

		boolean power = false;
		String productName = "";
		String producedDate = "";
		int volume = 0;

		power = false;
		productName = "삼성";
		producedDate = "2023-05-15";
		volume = 10;

		Ch7BeamProjecter beamProjecter = new Ch7BeamProjecter(power, productName, producedDate, volume);

		beamProjecter.power();

		System.out.println("제품이름: " + productName);
		System.out.println("제조날짜: " + producedDate);

		beamProjecter.volumeUp(volume);
		beamProjecter.volumeDown(volume);
	}
}