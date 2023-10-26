// 미구현클래스
public abstract class Tv {

	protected boolean power; // tv전원 전원이 꺼진 상태에서는 다른 기능들이 절대 작동되어서는 안된다.
	protected int channel; // 채널 제일 작은 채널값은 1 최대값 5 5를 넘기면 1이 되어야 함 / 1에서 내려가면 5

	protected int volume; // 볼륨 소 0 최대 3 0에서는 더 내려가지 않음 / 3에서 더 올라가면 안됨

	public Tv() {
		power = false;
		channel = 1;
		volume = 0;
	}

	// tv전원 키거나 끔
	public abstract void powerButton();

	// 채널을 올린다
	public void channelUp() {
		++channel;
		System.out

		
	// 채널을 내린다
	public void channelDown() {
		--channel;
		System.out

// 볼륨을 올린다
	public void volumeUp() {
		volume++;
		
		System.ou

		
	// 볼륨을 낮춘다
	public void volumeDown() {
		volume--;
		
		System.ou

		
	@Override

	}
}