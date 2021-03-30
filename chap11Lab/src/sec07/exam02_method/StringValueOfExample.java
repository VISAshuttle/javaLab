package sec07.exam02_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		// valueOf(): 기본형 데이터를 문자열 형식으로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
