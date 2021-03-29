package sec09.exam01_instance_member;

public class Car {
	String model;
	int speed;

	Car(String model) {
		this.model = model; // this.model은 인스턴스 필드
	}

	void setSpeed(int speed) {
		this.speed = speed; // this.speed는 인스턴스 필드
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "의 속력은 현재 " + i + "km/h입니다.");
		}
	}

}
