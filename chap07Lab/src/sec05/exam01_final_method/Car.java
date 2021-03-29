package sec05.exam01_final_method;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed++;
	}
	
	public final void stop() {
		System.out.println("차를 정지합니다.");
		speed = 0;
	}
}
