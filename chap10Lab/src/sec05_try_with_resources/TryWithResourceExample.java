package sec05_try_with_resources;

public class TryWithResourceExample {

//	public static void main(String[] args) throws Exception {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("file.txt");
//			fis.read();
//			throw new Exception();
//			
//		} catch (Exception e) {
//			System.out.println("예외 처리 코드");
//		} finally {
//			fis.close();
//		}
//	}
	
	// 자동 리소스 닫기
	// 리소스 객체는 java.lang.AutoCloseable 인터페이스 구현하고 있어야 함
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
//			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("예외 처리 코드");
		}
	}

}
