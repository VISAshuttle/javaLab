package sec05.exam01_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// Cannot override the final method from Car
//	public void stop() {
//		System.out.println("스포츠카 정지");
//		speed = 0;
//	}
}
