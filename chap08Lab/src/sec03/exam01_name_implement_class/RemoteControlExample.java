package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 타입 변수
		RemoteControl rc;
		rc = new Television(); // 구현객체 -> 인터페이스 자동 형변환
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();
		System.out.println("--------------");
		
		rc = new Audio(); // 구현객체 -> 인터페이스 자동 형변환
		rc.turnOn();
		rc.setVolume(12);
		rc.setMute(false);
		rc.turnOff();
	}

}
