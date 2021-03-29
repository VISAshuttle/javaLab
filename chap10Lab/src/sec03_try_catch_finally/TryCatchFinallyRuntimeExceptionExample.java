package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("파라미터가 부족합니다.");
		} finally {
			// 예외발생 여부와 상관없이 항상 실행되는 코드
			// try 블록과 catch 블록에서 return문을 사용하더라도 finally 블록은 항상 실행된다.
			System.out.println("다시 실행하세요.");
		}
	}

}
