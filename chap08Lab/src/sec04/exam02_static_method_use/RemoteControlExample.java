package sec04.exam02_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 정적 메소드
		// 인터페이스 또는 구현클래스 객체를 생성하지 않고도 사용 가능
		RemoteControl.changeBattery();
		
		// 디폴트 메소드
		// 익명 구현 객체 생성 후에 사용 가능
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() { }
			@Override
			public void turnOff() { }
			@Override
			public void setVolume(int volume) { }
		};
		rc.setMute(true); // 디폴트 메소드
	}

}
