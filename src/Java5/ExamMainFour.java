import hk.exam.eight.Book;
import hk.exam.eight.Computer;
import hk.exam.eight.Customer;
import hk.exam.eight.FreeShop;
import hk.exam.eight.SmartPhone;
import hk.exam.eight.Tv;

public class ExamMainFour {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		// 면세점에는 단 하나의 책, 컴퓨터, Tv, 스마트폰이 있다.
		// A고객은 책과 Tv를 사고 B고객이 컴퓨터와 스마트폰을 구입하려고 한다.
		// A고객은 책은 구매했지만 Tv는 비싸서 구입을 하지 못한다.
		// B고객은 컴퓨터와 스마트폰을 구매한다.
		// A고객이 컴퓨터와 스마트폰을 사려고 하면 이미 다 팔렸다고 알려준다
		// 마찬가지로 B고객이 책과 Tv를 살려고 하면 책은 이미 팔렸다고 알려준다.
		// 대신 Tv는 남아있어서 B고객은 Tv를 산다.
		// 소수점 첫째자리는 10원 둘째 자리는 1원 단위

		Ch7Customer gangsucwon = new Ch7Customer("강석원", 22, 100000);
		Ch7Customer songkmdong = new Ch7Customer("송금동", 24, 1000000);

		Ch7Book book = new Ch7Book("잡아라 Java", "자바 입문자들을 위한 바이블");
		Ch7Tv tv = new Ch7Tv("울트라콘솔Tv", "밝은 곳에서도 선명한 초밀도 화질, 차원이 다른 몰입감");
		Ch7Computer computer = new Ch7Computer("Gaming Pascal DeskTop", "최강 성능 세계 유일의 데스크탑!");
		SmartPhone smartPhone = new SmartPhone("hkSmartPhone", "당신의 상상력의 한계가 사라집니다.");

		FreeShop anabadaFreeShop = new FreeShop(book, computer, tv, smartPhone);

		// A고객 구매 책, tv
		System.out.println(gangsucwon.getName());
		anabadaFreeShop.buy(gangsucwon, book);
		anabadaFreeShop.buy(gangsucwon, tv);

		System.out.println(gangsucwon);

		System.out.println();
		// B고객 구매 컴퓨터, 스마트폰
		System.out.println(songkmdong.getName());
		anabadaFreeShop.buy(songkmdong, computer);
		anabadaFreeShop.buy(songkmdong, smartPhone);

		System.out.println(songkmdong);

		System.out.println();
		// A고객 구매 컴퓨터 스마트폰
		System.out.println(gangsucwon.getName());
		anabadaFreeShop.buy(gangsucwon, computer);
		anabadaFreeShop.buy(gangsucwon, smartPhone);

		System.out.println(gangsucwon);

		System.out.println();
		// B고객 구매 책, tv
		System.out.println(songkmdong.getName());
		anabadaFreeShop.buy(songkmdong, book);
		anabadaFreeShop.buy(songkmdong, tv);

		System.out.println(songkmdong);

		System.out.println();
		System.out.println(anabadaFreeShop);
	}

}
