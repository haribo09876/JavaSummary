public class Ch7SilenceTv extends Ch7Tv { // TV기능 물려받기

	// 음소거 속성을 키거나 끈다
	boolean mute = false;

	// 이전 볼륨의 값
	int beforeVolume;

	// 음소거버튼 기능구현
	void silenceButton() {
		mute = !mute;

		if (mute == true) {
			beforeVolume = volume;
			volume = 0;
		} else {
			volume = beforeVolume;
		}
	}
}