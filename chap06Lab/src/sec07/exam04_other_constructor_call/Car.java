package sec07.exam04_other_constructor_call;

public class Car {
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;

	// 기본 생성자
	Car() {

	}

	// this -> 자신의 객체를 지칭
	// this() -> 자신의 생성자를 호출
	// super -> 부모 객체를 지칭
	// super() -> 부모 객체의 생성자를 호출
	Car(String model) {
		this(model, null);
	}

	Car(String model, String color) {
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
