package sec05.exam04_casting;

public class Bus implements Vehicle {

	// 인터페이스를 구현하려면 반드시 추상메소드를 재정의해야 한다.
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}

}
