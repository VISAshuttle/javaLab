package sec13.exam02_constructor_access_package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	public A(boolean bool) {

	}

	A(int num) {

	}

	private A(String str) {

	}
}
