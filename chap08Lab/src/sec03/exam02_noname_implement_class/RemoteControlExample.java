package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 익명 구현객체 생성
		// 인터페이스를 딱 한 번만 사용할 목적이라면 구현 클래스를 정의하지 않고도 사용 가능
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}

		}; // 하나의 실행문이므로, 마지막에 세미콜론을 잊지 말 것
		
		// 그러나 반복해서 사용되는 경우, 구현클래스를 정의해서 사용하는 것이 바람직하다.
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub

			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub

			}

		};
	}

}
