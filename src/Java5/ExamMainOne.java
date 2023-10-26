import hk.exam.five.SilenceDisplayTv;

public class ExamMainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SilenceDisplayTv sTv = new SilenceDisplayTv();

		// 동작 안함
		sTv.silenceButton();
		sTv.channelUp();
		sTv.volumeDown();

		// 전원 켜기
		sTv.powerButton();
		System.out.println(sTv.toString());
		System.out.println();

		// 채널 올리기
		for (int i = 1; i <= 6; i++) {
			sTv.channelUp();
		}
		System.out.println(sTv.toString());
		System.out.println();

		// 채널 내리기
		for (int i = 6; i >= 1; i--) {
			sTv.channelDown();
		}
		System.out.println(sTv.toString());
		System.out.println();

		// 볼륨 내리기
		for (int i = 2; i >= 1; i--) {
			sTv.volumeDown();
		}
		System.out.println(sTv.toString());
		System.out.println();

		// 볼륨 올리기
		for (int i = 1; i <= 5; i++) {
			sTv.volumeUp();
		}
		System.out.println(sTv.toString());
		System.out.println();

		// 음소거 버튼 시작
		sTv.silenceButton();
		System.out.println();
		System.out.println(sTv.toString());
		System.out.println();

		// 음소거 버튼 종료
		sTv.silenceButton();
		System.out.println();
		System.out.println(sTv.toString());
		System.out.println();

		// Tv종료
		sTv.powerButton();
		System.out.println();
		System.out.println(sTv.toString());

	}

}
