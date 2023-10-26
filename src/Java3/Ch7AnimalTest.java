public class Ch7AnimalTest {

	public static void main(String[] args) {

		Ch7Dog dog = new Ch7Dog();
		dog.leg = 4;
		dog.mouth = "입";

		dog.walk();
		dog.run();
		dog.eat();
		dog.sleep();
		System.out.println();

		Ch7Rabbit rabbit = new Ch7Rabbit();
		rabbit.leg = 4;
		rabbit.mouth = "입";

		rabbit.walk();
		rabbit.run();
		rabbit.eat();
		rabbit.sleep();
		System.out.println();

		Ch7Cat cat = new Ch7Cat();
		cat.leg = 4;
		cat.mouth = "입";

		cat.walk();
		cat.run();
		cat.eat();
		cat.sleep();
	}
}