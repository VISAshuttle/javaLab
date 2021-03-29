package sec07.exam03_constructor_overloading;

public class Car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;

	// 기본 생성자
	Car() {

	}

	// 생성자 오버라이딩
	// 메소드의 이름은 같고, 매개변수의 순서, 종류, 개수 등을 다르게
	Car(String model) {
		this.model = model;
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
