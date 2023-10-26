import java.util.Calendar;

public class Ch12BasicCalendar {

	public static void main(String[] args) {

		// Date 이후에 만들어진 2000년을 표현 가능한 추상클래스
		// Calendar cal = new Calendar();
		// 추상클래스는 new 불가능
		Calendar cal = Calendar.getInstance();

		int year = 0;
		int month = 0;
		int date = 0;
		int day = 0;

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		day = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("년 : " + year);
		// 달만 +1 필요
		System.out.println("월 : " + month);
		System.out.println("일 : " + date);
		// 요일은 1~7
		// 일요일 1, 월요일 2, 토요일 7
		System.out.println("요일 : " + day);
	}
}