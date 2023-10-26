public class Ch6StudentTest {

	public static void main(String[] args) {

		String name = ""; // 학생이름
		int ban = 0; // 반
		int no = 0; // 번호
		int kor = 0; // 국어점수
		int eng = 0; // 영어점수
		int math = 0; // 수학점수

		name = "홍길동";
		ban = 2;
		no = 1;
		kor = 100;
		eng = 60;
		math = 76;

		Ch6Student student = new Ch6Student(name, ban, no, kor, eng, math);
		System.out.print("이름: " + name + " / ");
		System.out.print("반: " + ban + " / ");
		System.out.println("번호: " + no);

		System.out.print("국어: " + kor + " / ");
		System.out.print("영어: " + eng + " / ");
		System.out.println("수학: " + kor);

		int total = student.getTotal();
		System.out.println("총점: " + total);

		double average = student.getAverage();
		System.out.println("평균: " + average);
	}
}