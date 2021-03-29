package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("파라미터 부족");
			
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("숫자로 변환 불가능");

		} finally {
			System.out.println("다시 실행하세요.");
		}
		
		// 다중 catch문을 구현할 땐 범주가 큰 예외처리를 나중에 둔다.
		// 예) 모든 예외를 처리하는 try (Exception e) {} 구문을 위에 두면,
		//     밑에 있는 세부 예외처리 구문은 Unreachable이 됨
	}

}
