package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "123456-1234567";
		int length = ssn.length();
		if (length == 14 && ssn.indexOf("-") != -1) {
			System.out.println("주민등록번호 형식입니다.");
		} else {
			System.out.println("주민등록번호 형식이 아닙니다.");
		}
	}

}
