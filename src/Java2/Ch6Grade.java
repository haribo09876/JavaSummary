public class Ch6Grade {

	int korScore = 0;
	int engScore = 0;
	int mathScore = 0;

	void gradeDetector() {
		int averageScore = (korScore + engScore + mathScore) / 3;
		char grade = ' ';

		if (averageScore > 89) {
			grade = 'A';
			System.out.println("평균점수 : " + averageScore);
			System.out.println("학점 : " + grade);
		} else if (averageScore > 79) {
			grade = 'B';
			System.out.println("평균점수 : " + averageScore);
			System.out.println("학점 : " + grade);
		} else if (averageScore > 69) {
			grade = 'C';
			System.out.println("평균점수 : " + averageScore);
			System.out.println("학점 : " + grade);
		} else if (averageScore > 59) {
			grade = 'D';
			System.out.println("평균점수 : " + averageScore);
			System.out.println("학점 : " + grade);
		} else {
			grade = 'F';
			System.out.println("평균점수 : " + averageScore);
			System.out.println("학점 : " + grade);
		}
	}
}