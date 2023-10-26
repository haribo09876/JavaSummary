public class Ch6Time {
	// 시간의 개념
	// 1. 시, 분, 초 는 모두 0보다 크거나 같아야 한다
	// 2. 시의 범위는 0~23, 분과 초의 범위는 0~59이다
	private int hour = 0;
	private int minute = 0;
	private double second = 0.0;

	public int getHour() {
		return hour;
	}

	public void setHour(int h) {
		if (h < 0 || h > 23) {
			return;
		}
		hour = h;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int m) {
		if (m < 0 || m > 59) {
			return;
		}
		minute = m;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double s) {
		if (s < 0 || s > 59) {
			return;
		}
		second = s;
	}
}