public class Ch6HumanTest {

	public static void main(String[] args) {

		System.out.println("메서드를 써야 하는 이유");
		System.out.println("여러 명이라면?");
		System.out.println("사람의 특성에 나이와 몸무게를 더 한다면?");
		System.out.println("하나가 변경되면 중요한 로직들이 전부 변하는 힘");
		System.out.println("이것이 메서드를 사용하는 이유 중 하나다");
		System.out.println("유지보수 개발에 진가가 발휘 됨");

		// 사람은 다양한 건물에 갈 수 있다
		// 집에만 가지 말고 다른 곳에도 갈 수 있게 개발해 봐

		String buildingName = "";
		Ch6Human human = new Ch6Human();
		human.name = "홍길동";
		human.age = 30;
		human.weight = 70.1;
		buildingName = "집";
		human.goBuilding(buildingName);
		human.myInfoView();

		Ch6Human human2 = new Ch6Human();
		human2.name = "일지매";
		human2.age = 40;
		human2.weight = 80;
		buildingName = "기왓집";
		human2.goBuilding(buildingName);
		human2.myInfoView();

		Ch6Human human3 = new Ch6Human();
		human3.name = "성춘향";
		human3.age = 20;
		human3.weight = 58;
		buildingName = "궁궐";
		human3.goBuilding(buildingName);
		human3.myInfoView();

		Ch6Human human4 = new Ch6Human();
		human4.name = "임꺽정";
		human4.age = 45;
		human4.weight = 92.8;
		buildingName = "학원";
		human4.goBuilding(buildingName);
		human4.myInfoView();

		Ch6Human human5 = new Ch6Human();
		human5.name = "콩쥐";
		human5.age = 26;
		human5.weight = 63;
		buildingName = "학교";
		human5.goBuilding(buildingName);
		human5.myInfoView();
	}
}