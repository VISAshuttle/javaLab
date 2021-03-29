package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;

		// Enum.name(): 열거형 상수의 이름 반환
		String name = today.name();
		System.out.println(name);

		// Enum.name(): 열거형 상수의 순번 반환
		int order = today.ordinal();
		System.out.println(order);

		// Enum.compareTo(): 대상 객체와의 순번 차이를 반환
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDENESDAY;
		int result1 = day1.compareTo(day2); System.out.println(result1);
		int result2 = day2.compareTo(day1); System.out.println(result2);
	}

}
