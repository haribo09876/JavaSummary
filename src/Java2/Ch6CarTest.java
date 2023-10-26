public class Ch6CarTest {

	public static void main(String[] args) {
		String color = "";
		String gearType = "";
		int door = 0;

		color = "blue";
		gearType = "manual";
		door = 2;

		Ch6Car car = new Ch6Car(color, gearType, door);
		System.out.println(car.color);
		car.carInfo();
	}
}