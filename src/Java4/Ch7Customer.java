public class Ch7Customer {
	public int money = 0; // 소유금액
	public int bonusPoint = 0; // 보너스점수
	public String customerName = "";
	public Ch7Product product = null;

	public Ch7Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}

	public void buy(Ch7Product product) {
		System.out.println(customerName + "의 소지금액은 " + money + "만원 입니다");

		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= product.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += product.bonusPoint; // 제품의 보너스 점수를 추가한다.
		System.out.println(product + "을/를 구입하셨습니다.");
		this.product = product;
		System.out.println("현재 남은 돈은 " + money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + bonusPoint + "점입니다.");
		System.out.println();
	}

	public void useProduct() {
		if (product instanceof Ch7Book) {
			Ch7Book book = (Ch7Book) product;
			book.use();
		} else if (product instanceof Ch7Computer) {
			Ch7Computer com = (Ch7Computer) product;
			com.use();
		} else if (product instanceof Ch7SmartPhone) {
			Ch7SmartPhone smartPhone = (Ch7SmartPhone) product;
			smartPhone.use();
		} else if (product instanceof Ch7Tv) {
			Ch7Tv tv = (Ch7Tv) product;
			tv.use();
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "현재 남은 돈은 " + money + "만원입니다.\n";
		str = str + "현재 보너스점수는 " + bonusPoint + "점입니다.";
		return str;
	}
}