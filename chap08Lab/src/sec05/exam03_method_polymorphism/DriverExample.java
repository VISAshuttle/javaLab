package sec05.exam03_method_polymorphism;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();		// Vehicle 인터페이스의 구현 객체
		Taxi taxi = new Taxi();	// Vehicle 인터페이스의 구현 객체
		
		// Driver.drive(Vehicle vehicle): 매개변수가 Vehicle 인터페이스 타입
		driver.drive(bus);	// 구현객체를 매개변수로 넣어도 호출 가능
		driver.drive(taxi);	// 구현객체를 매개변수로 넣어도 호출 가능
	}

}
