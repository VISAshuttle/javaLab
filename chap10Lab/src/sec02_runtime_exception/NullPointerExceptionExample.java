package sec02_runtime_exception;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
//		System.out.println(data.toString()); // java.lang.NullPointerException
		data = "홍길동";
		System.out.println(data.toString());
		
	}

}
