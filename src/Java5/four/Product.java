public class Product implements Cloneable {
	protected String name = ""; // 제품명
	protected String explain = ""; // 제품설명
	protected double price; // 제품의 가격
	protected double bonusPoint; // 제품구매 시 제공하는 보너스점수

	public Product() {
		super();
	}

	// 제품의 정보를 등록하는 생성자
	// 제품을 구입할 때 얻는 보너스점수는 제품가격의 7.13%로 지정(단, 소수점 3째자리에서 반올림 한다.)
	public Product(double price) {

		this.price = price;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {

		this.bonusPoint = bonusPoint;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
