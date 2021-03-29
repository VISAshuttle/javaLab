package sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 다중 구현 객체 생성
		SmartTelevision smartTV = new SmartTelevision();
		
		// 2개의 인터페이스 타입에 모두 대입이 가능
		RemoteControl rc = smartTV;
		Searchable searchable = smartTV;
	}

}
