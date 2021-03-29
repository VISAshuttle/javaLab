package sec04.exam01_overriding;

public class Computer extends Calculator {

	// @Override 어노테이션
	// 컴파일러에게 '재정의 여부' 검사를 지시 -> 부모 클래스의 메소드 선언부와 동일한지?
	@Override
	double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * Math.pow(radius, 2);
	}
	
	// @Override 어노테이션으로 검사를 지시했더니, 재정의된 메소드가 아니라는 에러 발생
	// area~가 아닌 are~ 로 오타를 냈더니 오버라이딩이 아니라는 판단
	// The method areCircle(double) of type Computer must override or implement a supertype method
	/*
	 * @Override double areCircle(double radius) { return radius * 2; }
	 */
	
}
