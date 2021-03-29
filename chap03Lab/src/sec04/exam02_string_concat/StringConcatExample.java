package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		String str1 = "JDK " + 6.0;
		System.out.println(str1);
		
		// 숫자와 문자열이 섞인 경우 왼쪽부터 순서대로 결합
		String str2 = "JDK " + 3 + 3.0;
		System.out.println(str2);
		
		// 숫자끼리는 산술연산 수행
		String str3 = 3 + 3.0 + "JDK";
		System.out.println(str3);
	}

}
