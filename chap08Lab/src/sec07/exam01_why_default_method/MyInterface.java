package sec07.exam01_why_default_method;

public interface MyInterface {
	public void method1();
//	public void method2();
	
	default void method2() {
		
	}
	
}
