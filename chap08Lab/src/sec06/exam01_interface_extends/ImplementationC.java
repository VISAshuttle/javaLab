package sec06.exam01_interface_extends;

public class ImplementationC implements InterfaceC {
	// InterfaceC를 구현하려면,
	// InterfaceC가 상속받은 부모 인터페이스들의 추상 메소드를 모두 재정의해야 한다.

	@Override
	public void methodA() {
		System.out.println("ImplementationC.methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC.methodB()");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC.methodC()");
	}

}
