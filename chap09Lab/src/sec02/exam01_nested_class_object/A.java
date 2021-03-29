package sec02.exam01_nested_class_object;

// 바깥 클래스
public class A {
	A() {
		System.out.println("A 객체 생성");
	}
	
	// 인스턴스 멤버 클래스
	public class B {
		B() {
			System.out.println("B 객체 생성");
		}
		int field1;
		// The field field2 cannot be declared static in a non-static inner type,
		// unless initialized with a constant expression
//		static int field2; 
		
		void method1() {}
//		static void method2() {}
	}
	
	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 객체 생성");
		}
		// 정적 멤버 클래스 내에선 정적 필드, 메소드 생성 가능
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// 로컬 클래스
		class D {
			D() {
				System.out.println("D 객체 생성");
			}
			int field1;
//			static int field2;
			void method1() {}
//			static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
