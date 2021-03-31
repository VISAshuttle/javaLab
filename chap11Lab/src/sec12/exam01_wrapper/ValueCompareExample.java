package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128 ~ 127 범위 초과하는 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== 비교결과: " + (obj1 == obj2)); // false
		System.out.println("언박싱 후 == 비교결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		
		System.out.println();
		
		System.out.println("[-128 ~ 127 (1Byte) 범위일 경우]");
		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("== 비교결과: " + (obj3 == obj4)); // true
		System.out.println("언박싱 후 == 비교결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
