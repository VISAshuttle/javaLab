package sec07.exam03_constructor_overloading;

public class CarExample {

	public static void printCarInfo(Car car) {
		System.out.printf("Car.company \t = %s\n", car.company);
		System.out.printf("Car.model \t = %s\n", car.model);
		System.out.printf("Car.color \t = %s\n", car.color);
		System.out.printf("Car.maxSpeed \t = %d\n", car.maxSpeed);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		printCarInfo(car1);
		
		Car car2 = new Car("자가용");
		printCarInfo(car2);
		
		Car car3 = new Car("자가용", "빨강");
		printCarInfo(car3);
		
		Car car4 = new Car("택시", "검정", 200);
		printCarInfo(car4);
		
	}

}