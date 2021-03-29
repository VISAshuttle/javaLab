package sec06.exam01_protected.package1;

public class B {
	public void method() {
		A a = new A(); // protected 개체는 같은 패키지 내에서 사용 가능
		a.field = "값입력";
		a.method();
	}
}
