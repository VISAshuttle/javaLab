package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	// 구현객체->인터페이스 업캐스팅
		vehicle.run();
//		vehicle.checkFare(); // 구현객체->인터페이스 업캐스팅으로 참조영역이 축소됨
		
		Bus bus = (Bus) vehicle;		// 인터페이스->구현객체 다운캐스팅
		bus.run();
		bus.checkFare();		// 인터페이스->구현객체 다운캐스팅으로 축소된 참조영역을 원래대로 복원
	}

}
