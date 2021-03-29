package sec02.exam04_default_method;

public interface RemoteControl {
	// 상수	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 생략 가능
	
	// 추상 메소드
	abstract void turnOn();
	abstract void turnOff();
	void setVolume(int volume); // abstract 생략 가능
	
	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("음소거합니다.");
		} else {
			System.out.println("음소거를 해제합니다.");
		}
	}
	
	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
