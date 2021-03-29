package sec06.exam01_interface_extends;

public class Example {

	public static void main(String[] args) {
		ImplementationC implC = new ImplementationC();
		
		InterfaceA intA = implC;
		intA.methodA();
		System.out.println();
		
		InterfaceB intB = implC;
		intB.methodB();
		System.out.println();
		
		InterfaceC intC = implC;
		intC.methodA();
		intC.methodB();
		intC.methodC();
	}

}
