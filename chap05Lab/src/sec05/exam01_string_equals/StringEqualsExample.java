package sec05.exam01_string_equals;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		System.out.println(strVal1 == strVal2);
		
		String strVal3 = new String("아무개");
		String strVal4 = "아무개";
		System.out.println(strVal3 == strVal4);
		System.out.println(strVal3.equals(strVal4));
	}

}
