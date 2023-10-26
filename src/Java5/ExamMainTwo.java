import hk.exam.six.Tv;
import hk.exam.six.TvRemoteControl;

public class ExamMainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tv 하나 존재
		Ch7Tv tv = new Ch7Tv();
		// tv 리모컨 하나 존재
		TvRemoteControl tvRemoken = new TvRemoteControl();

		// 리모컨으로 정보표시 버튼 누름
		tvRemoken.representationInfoButton(tv);
		System.out.println();

		// 리모컨으로 tv 파워 버튼 누름 (tv 전원 켜짐)
		tvRemoken.powerButton(tv);
		System.out.println();

		// 리모컨으로 정보표시 버튼 누름
		tvRemoken.representationInfoButton(tv);
		System.out.println();

		// 리모컨으로 tv 볼륨 올리기 버튼 6번 누름
		for (int i = 0; i < 6; i++) {
			tvRemoken.volumeUp(tv);
		}
		System.out.println();

		// 리모컨으로 정보표시 버튼 누름
		tvRemoken.representationInfoButton(tv);
		System.out.println();

		// 리모컨으로 음소거 버튼 누름 (음소거 사용중)
		tvRemoken.silence(tv);
		System.out.println();

		// 리모컨으로 볼륨 낮추기 버튼 누름
		tvRemoken.volumeDown(tv);
		System.out.println();

		// 리모컨으로 음소거 버튼 누름 (음소거 종료함)
		tvRemoken.silence(tv);
		System.out.println();

		// 리모컨으로 녹화 버튼 누름 (녹화 시작)
		tvRemoken.recordButton(tv);
		System.out.println();

		// 리모컨으로 채널 올리기 6번 누름
		for (int i = 0; i < 6; i++) {
			tvRemoken.channelUp(tv);
		}
		System.out.println();

		// 리모컨으로 채널 내리기 3번 누름
		for (int i = 0; i < 3; i++) {
			tvRemoken.channelDown(tv);
		}
		System.out.println();

		// 리모컨으로 녹화 버튼 누름 (녹화 종료)
		tvRemoken.recordButton(tv);
		System.out.println();

		// 리모컨으로 tv 전원 버튼 누름 (tv 종료)
		tvRemoken.powerButton(tv);

	}

}
