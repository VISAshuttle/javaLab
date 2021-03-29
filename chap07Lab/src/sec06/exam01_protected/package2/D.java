package sec06.exam01_protected.package2;

import sec06.exam01_protected.package1.A;

public class D extends A {
	public D() {
//		super();
		this.field = "value"; // protected는 자식 클래스에서의 접근을 허용
		this.method();
	}
}
