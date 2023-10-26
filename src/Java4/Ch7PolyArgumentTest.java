import java.util.Scanner;
import Ch7Book;
import Ch7Computer;
import Ch7Product;
import Ch7SmartPhone;
import Ch7Tv;

// 다형성 활용 -> 메서드 매개변수
public class Ch7PolyArgumentTest {

	public static void main(String[] args) {
		Ch7Tv tv = new Ch7Tv();
		Ch7Computer com = new Ch7Computer();
		SmartPhone smartPhone = new SmartPhone();
		Ch7Book book = new Ch7Book();

		// 6명의 고객들이 존재한다
		// 서로 다른 이름과 소지금액을 가지고 있다
		// 6명의 고객들은 모두 스마트폰을 구입한다
		Ch7Customer customer1 = new Ch7Customer("customer1a", 1000);
		customer1.buy(smartPhone);
		Ch7Customer customer2 = new Ch7Customer("customer1b", 900);
		customer2.buy(smartPhone);
		Ch7Customer customer3 = new Ch7Customer("customer1c", 800);
		customer3.buy(smartPhone);
		Ch7Customer customer4 = new Ch7Customer("customer1d", 700);
		customer4.buy(smartPhone);
		Ch7Customer customer5 = new Ch7Customer("customer1e", 600);
		customer5.buy(smartPhone);
		Ch7Customer customer6 = new Ch7Customer("customer1f", 500);
		customer6.buy(smartPhone);

		// 3명의 고객들이 존재한다
		// 서로 다른 이름과 소비금액을 가지고 있다
		// 3명의 고객들은 모두 Tv를 구입한다
		Ch7Customer customer7 = new Ch7Customer("customer2a", 400);
		customer7.buy(tv);
		Ch7Customer customer8 = new Ch7Customer("customer2b", 300);
		customer8.buy(tv);
		Ch7Customer customer9 = new Ch7Customer("customer2c", 200);
		customer9.buy(tv);

		// 4명의 고객들은 컴퓨터와 책을 함께 구매한다
		// 서로 다른 이름과 소비금액을 가지고 있다
		Ch7Customer customer10 = new Ch7Customer("customer3a", 1100);
		customer10.buy(com);
		customer10.buy(book);
		Ch7Customer customer11 = new Ch7Customer("customer3b", 1200);
		customer11.buy(com);
		customer11.buy(book);
		Ch7Customer customer12 = new Ch7Customer("customer3c", 1300);
		customer12.buy(com);
		customer12.buy(book);
		Ch7Customer customer13 = new Ch7Customer("customer3d", 1400);
		customer13.buy(com);
		customer13.buy(book);
	}
}