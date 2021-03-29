package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous any = new Anonymous();

		// 익명 자식 객체의 메소드를 사용
		any.field.wake();
//		any.field.work(); // 부모 클래스(Person)에 정의되지 않은 멤버는 사용불가
		
		any.method1();
		
		any.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
	}

}
