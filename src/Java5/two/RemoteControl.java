package hk.exam.six;

public interface RemoteControl extends Record, Silence {
	// 사용가능한 Tv이름
	String REMOTE_CONTROL_TV_NAME = "HK02 Fighting Tv";

	// 전원 버튼
	void powerButton(Ch7Tv tv);

	// 볼륨 낮추기 버튼
	void volumeDown(Ch7Tv tv);

	// 볼륨 올리기 버튼
	void volumeUp(Ch7Tv tv);

	// 채널 올리기 버튼
	void channelUp(Ch7Tv tv);

	// 채널 낮추기 버튼
	void channelDown(Ch7Tv tv);

	// 현재 Tv 정보표시 (Tv 채널, 볼륨 표시 및 Tv이름)
	void representationInfoButton(Ch7Tv tv);

}
