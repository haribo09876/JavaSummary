// 면세점
public class FreeShop {

	// 면세점이 열리면 책, 컴퓨터, Tv, 스마트폰을 한개 판매 가능하다
	// 상품을 한번 판매한 경우 해당 상품은 존재하지 않는다. ex) 책을 팔았으면 책은 존재하지 않음 하지만 나머지 상품은 존재한다.

	double storeMoney = 0; // 주인장의 소지금
	private Ch7Book book = null; // 책 한권
	private Ch7Computer computer = null; // 컴퓨터 한개
	private Ch7Tv tv = null; // Tv 한개
	private SmartPhone smartPhone = null; // 스마트폰 한개

	public FreeShop() {
		super();
	}

	public FreeShop(Book book, Computer computer, Ch7Tver, Tv tv, SmartPhone smartPhone){
		this.storeMoney = 100000; // 초기자금은 무조건 10만원
		this.book = book;
		this.computer = computer;
		this.tv = tv;
		this.smartPhone = smartPhone;
	}

	// 물건 구입
	// 메서드명 buy로 작성하시오
	/**
	 * @param customer 고객
	 * @param ??       어떤 상품을 살까
	 * @throws CloneNotSupportedException
	 */

	// 물건이 존재하는지 여부

	// 물건이 존재하면 구매 가능여부 확인
	// 나의 소지금으로 해당 상품의 구매가 가능하면

	// 나의 소지금으로 해당 상품의 구매가 불가능하면

	@Override
	public String toString() {
		return "FreeShop 상태 = 매진: [storeMoney=" + storeMoney + ", book=" + book + ", computer=" + computer + ", tv=" + tv
				+ ", smartPhone=" + smartPhone + "]";
	}

}
