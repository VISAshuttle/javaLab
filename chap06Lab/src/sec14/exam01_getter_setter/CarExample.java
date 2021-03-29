package sec14.exam01_getter_setter;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed() + " km/h");
	}

}
