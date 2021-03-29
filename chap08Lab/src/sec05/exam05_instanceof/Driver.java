package sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) { // Bus 객체일 경우에만 Bus.checkFare() 메소드 호출
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
