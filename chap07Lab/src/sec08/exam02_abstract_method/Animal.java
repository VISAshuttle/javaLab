package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public abstract void sound();
	
	public void breathe() {
		System.out.println("숨을 쉰다");
	}
}
