import java.util.ArrayList;

// 물건을 구입할 수 있는 고객
public class Customer {

	private String name = ""; // 이름
	private int age = 0; // 나이
	private double money = 0.0; // 소지금
	private double myBonusPoint = 0.0; // 보너스 보인트
	private ArrayList<Ch7Product> productList = null; // 구매한 제품들

	public Customer(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.productList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMyBonusPoint() {
		return myBonusPoint;
	}

	public void setMyBonusPoint(double myBonusPoint) {
		this.myBonusPoint = myBonusPoint;
	}

	public ArrayList<Ch7Product> getProductList() {
		return productList;
	}

	// 제품 하나 추가 (getter/setter 중 setter을 수정)
	public void setProduct(Ch7Product product) {
		productList.add(product);
	}

	@Override
	public String toString() {
		double bonusRoundPrice = 0.0;

		bonusRoundPrice = myBonusPoint + 0.005;
		bonusRoundPrice = (int) (bonusRoundPrice * 100);
		bonusRoundPrice = bonusRoundPrice / 100;

		StringBuilder builder = new StringBuilder();
		builder.append("[나이: " + age + " 이름: " + name + "]\n");
		builder.append("왈: 어디보자 ");
		builder.append("남은 돈은 ");
		builder.append(money);
		builder.append("이고, 내가 산 물건은\n");

		for (int i = 0; i < productList.size(); i++) {
			builder.append(productList.get(i) + "\n");
		}
		builder.append("저런 것들이구나\n");
		builder.append("포인트는 ");
		builder.append(bonusRoundPrice + " 가 있네");

		return builder.toString();
	}

}
