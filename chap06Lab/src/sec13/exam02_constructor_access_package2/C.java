package sec13.exam02_constructor_access_package2;

import sec13.exam02_constructor_access_package1.A;

public class C {
	A a1 = new A(true);		// public은 어디서든 접근 가능
	
//	A a2 = new A(1);			// default는 같은 패키지 내에서만 접근 가능
							// (protect는 자식클래스까지 포함)
	
//	A a3 = new A("문자열");  // private는 같은 클래스 내에서만 접근 가능
}
