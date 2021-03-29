package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		// &
		// 항상 두 조건을 모두 검사
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}
		
		// &&
		// 앞의 조건이 참일 경우에만 뒤의 조건을 검사
		if (charCode >= 97 && charCode <= 122) {
			System.out.println("소문자입니다.");
		}
	}

}
