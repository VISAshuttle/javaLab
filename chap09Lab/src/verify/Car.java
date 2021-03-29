package verify;

public class Car {
	void method() {
		System.out.println("차에 탄다");
	}
	
	class Tire {
		void method() {
			System.out.println("타이어 굴러감");
		}
	}

	static class Engine {
		void method() {
			System.out.println("엔진 시동");
		}
	}
}