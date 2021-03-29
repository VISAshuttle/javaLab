package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Cannot instantiate the type Phone
//		Phone phone = new Phone("홍길동");
		
		SmartPhone galaxyS10 = new SmartPhone("박현우");
		galaxyS10.turnOn();
		galaxyS10.internetSearch();
		galaxyS10.turnOff();
	}

}
