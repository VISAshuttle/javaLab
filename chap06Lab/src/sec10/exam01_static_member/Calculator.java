package sec10.exam01_static_member;

public class Calculator {
	// 정적(static) 필드
	static double pi = 3.141592;

	// 정적(static) 메소드
	static int plus(int x, int y) {
		return x + y;
	}

	// 인스턴스 메소드
	int minus(int x, int y) {
		return x - y;
	}
}
