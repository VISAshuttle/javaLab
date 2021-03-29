package sec08.exam02_return;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(10);
		System.out.println("gasState(): " + myCar.gasState());
		myCar.run();
	}

}
