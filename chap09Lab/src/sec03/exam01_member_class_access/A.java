package sec03.exam01_member_class_access;

public class A {
	// 인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// 정적 메소드
	static void metho2() {
//		B var1 = new B(); // 정적 메소드에서는 인스턴스 멤버 객체를 사용 불가능
		C var2 = new C(); // 정적 메소드에서 정적 멤버 객체는 사용 가능
	}
	
	// 인스턴스 멤버 클래스
	class B {
		
	}
	
	// 정적 멤버 클래스
	static class C {
		
	}
}
