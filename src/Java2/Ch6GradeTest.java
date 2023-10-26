import java.util.Scanner;

public class Ch6GradeTest {

	public static void main(String[] args) {
		Ch6Grade grade = new Ch6Grade();
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 ");
		grade.korScore = sc.nextInt();
		System.out.print("영어점수를 입력하세요 ");
		grade.engScore = sc.nextInt();
		System.out.print("수학점수를 입력하세요 ");
		grade.mathScore = sc.nextInt();
		System.out.println();
		grade.gradeDetector();
	}
}