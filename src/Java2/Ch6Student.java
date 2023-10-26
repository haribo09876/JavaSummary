public class Ch6Student {

	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;

	public Ch6Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		int result = 0;
		result = kor + eng + math;
		return result;
	}

	double getAverage() {
		double result = 0;
		result = (int) (((kor + eng + math) / 3.0 + 0.005) * 100) / 100.0;
		return result;
	}
}