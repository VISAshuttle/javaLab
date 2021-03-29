package sec02.exam03_abstract_method;

public interface RemoteControl {
	// 상수	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final 생략 가능
	
	// 추상 메소드
	abstract void turnOn();
	abstract void turnOff();
	void setVolume(int volume); // abstract 생략 가능
}
