package sec13.exam03_field_method_access_package2;

import sec13.exam03_field_method_access_package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; // public (O)
//		a.field2 = 1; // default (X)
//		a.field3 = 1; // private (X)

		a.method1(); // public (O)
//		a.method2(); // default (X)
//		a.method3(); // private (X)
	}

}
