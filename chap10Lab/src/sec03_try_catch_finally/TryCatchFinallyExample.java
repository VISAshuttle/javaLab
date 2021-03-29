package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			// 예외발생 가능한 코드
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// 예외처리 코드
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
