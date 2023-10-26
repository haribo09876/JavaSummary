import java.util.ArrayList;

public class Ch11BasicArrayList1 {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();

		arrayList.add("String 가능1?");
		arrayList.add(1); // 값 삽입
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add("String 가능2?");
		arrayList.add(1);
		arrayList.add(999);
		arrayList.add(123.123);
		arrayList.add("String 가능2?");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("인덱스 위치 " + i + " - " + arrayList.get(i));
		}

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println((int) arrayList.get(i) + 100);
		}
	}
}