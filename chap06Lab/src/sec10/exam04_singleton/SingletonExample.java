package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton obj1 = new Singleton(); // The constructor Singleton() is not visible
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
	}

}
