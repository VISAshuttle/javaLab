package sec06_throws;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass1();
			findClass2();
		}
		catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 예외는 main() 메소드에서 처리했으니 안심하라구");
		}
	}

	public static void findClass1() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
	}
	
	public static void findClass2() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
